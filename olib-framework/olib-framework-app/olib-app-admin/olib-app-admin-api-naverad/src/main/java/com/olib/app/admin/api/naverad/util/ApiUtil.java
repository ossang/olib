package com.olib.app.admin.api.naverad.util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiUtil {

	public static int parseInt(Long data){
		return Integer.parseInt(data+"");
	}
	
	public static int parseInt(String data){
		return Integer.parseInt(data);
	}
	
	public static Object getJsonData(String jsonData, String key){
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonData);
			return jsonObject.get(key);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
