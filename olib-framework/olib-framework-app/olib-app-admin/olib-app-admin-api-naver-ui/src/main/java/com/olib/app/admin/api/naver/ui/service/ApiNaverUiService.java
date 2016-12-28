package com.olib.app.admin.api.naver.ui.service;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olib.app.admin.api.naver.ui.ApiNaverUiStarter;
import com.olib.app.admin.api.naver.ui.domain.ApiNaverUiConfig;
import com.olib.app.admin.api.naver.ui.domain.ClassInfo;
import com.olib.app.admin.api.naver.ui.domain.MethodInfo;
import com.thoughtworks.paranamer.BytecodeReadingParanamer;

@Service
public class ApiNaverUiService implements InitializingBean {
	
	private Properties properties;
	
	@Autowired
	private ApiNaverUiStarter starter;	
	
//------------------------------------------------------------------------------	
	public void afterPropertiesSet() throws Exception {
		this.properties = starter.getProperties();
	}
	
//------------------------------------------------------------------------------	
	public List<ClassInfo> getServiceList() {
		
		List<ClassInfo> classInfoList = new ArrayList<ClassInfo>();
		
		String[] classNamesArr = properties.get(ApiNaverUiConfig.PACKAGE_CALSS_PATH).toString().split(",");
		BytecodeReadingParanamer paranamer = new BytecodeReadingParanamer();
		
		for(String name : classNamesArr){
			try {
				Class<?> targetClass = Class.forName(properties.get(ApiNaverUiConfig.PACKAGE_PATH).toString()+"."+name);
				Method[] methods = targetClass.getDeclaredMethods();
				List<MethodInfo> methodList = new ArrayList<MethodInfo>();
				
				for(Method method : methods){
					methodList.add(new MethodInfo(
							method.getName(), 
							paranamer.lookupParameterNames(method,false),
							method.getParameterTypes(), 
							method.getReturnType()));
				}
				
				classInfoList.add(new ClassInfo(name, methodList));
				
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
		
		return classInfoList;
	}
	
	public Object executeMethod(String jsonContent) throws Exception{
		String jsonData = getJsonData(jsonContent, ApiNaverUiConfig.PARAM_JSONDATA).toString();
		String classPath = properties.getProperty(ApiNaverUiConfig.PACKAGE_PATH)+"."+getJsonData(jsonData, ApiNaverUiConfig.PARAM_SERVICE).toString();
		String methodName = getJsonData(jsonData, ApiNaverUiConfig.PARAM_METHOD).toString() ;
		Object[] parameterTypes = getJsonDataArray(jsonData, ApiNaverUiConfig.PARAM_PARAMETERTYPES);
		Map<String, Object> parameter = getParameterData(jsonData);
		
		return executeMethod(classPath, methodName, parameterTypes, parameter);
	}
	
	public Object executeMethod(
			String classPath, 
			String methodName, 
			Object[] parameterTypes, 
			Map<String, Object> parameter) throws Exception{
		
			Class<?> targetClass = Class.forName(classPath);
			Method[] methodList = targetClass.getDeclaredMethods();
			ArrayList<Object> parameterArr = new ArrayList<Object>();
			BytecodeReadingParanamer paranamer = new BytecodeReadingParanamer();
			
			
			boolean thisMethod = true;
			for(Method method:methodList){
				if(method.getName().equals(methodName) 
						&& parameterTypes.length == method.getParameterTypes().length){
					
					for(int i=0; i<method.getParameterTypes().length; i++){
						if(!method.getParameterTypes()[i].getName().equals(parameterTypes[i])){
							thisMethod = false; 
						}
					}
					
					if(thisMethod){
						String[] names = paranamer.lookupParameterNames(method,false);
						for(int i = 0; i<names.length; i++){
							parameterArr.add(getParseData(parameter.get(names[i]), method.getParameterTypes()[i].getName()));
						}
						
						// Class.forName 으로 생성한 클래스의 invoke경우 method 가 static 이 아닐경우 newInstance 로 객체를 생성해야 함.
						return method.invoke(targetClass.newInstance(),parameterArr.toArray());
					}
				}
			}
		return null;
	}
	
	public Object getParseData(Object data, String type){
		if(type.equals("java.lang.String") || type.equals("class java.lang.String")){
			return data.toString();
		}else if(type.toLowerCase().equals("int")){
			return Integer.parseInt(data.toString());
		}else if(type.toLowerCase().equals("boolean")){
			if(data.equals("true")){
				return true;
			}else{
				return false;
			}
		}else if(type.toLowerCase().equals("double")){
			return Double.parseDouble(data+"");
		}else if(type.toLowerCase().equals("long")){
			return Long.parseLong(data+"");
		}else{
			// 객체 타입의 파라미터가 올경우 처리!
			return null;
		}
	}
	
	public Object getJsonData(String jsonData, String key){
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);
			return jsonObject.get(key);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Object[] getJsonDataArray(String jsonData, String key){
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);
			JSONArray jsonArray = (JSONArray) jsonObject.get(key);
			return jsonArray.toArray();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Map<String, Object> getParameterData(String jsonData){
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);
			JSONObject jsonParam = (JSONObject) jsonObject.get(ApiNaverUiConfig.PARAM_PARAMETERS);
			
			HashMap<String, Object> paramMap = new HashMap<>();
			
			for(Object key : jsonParam.keySet()){
				paramMap.put(key.toString(), jsonParam.get(key));
			}
			
			return paramMap;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
