package com.olib.app.admin.api.naverad.util;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	public static String getValue(String jsonData, String key){
		try {
			HashMap<String, String> map = new ObjectMapper().readValue(jsonData, new TypeReference<Map<String,String>>(){});
			if(map != null) return map.get(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
}
