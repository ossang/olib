package com.olib.core.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class OlibNetUtil {
	
	// simple get request
	public static String request(String url) {
		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpResponse response = client.execute(new HttpGet(url));
			String body = EntityUtils.toString(response.getEntity());
			return body;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static String getClientIP(HttpServletRequest request) {
	     String ip = request.getHeader("X-FORWARDED-FOR"); 
	     
	     if(ip == null || ip.length() == 0) {
	         ip = request.getHeader("Proxy-Client-IP");
	     }
	     if(ip == null || ip.length() == 0) {
	         ip = request.getHeader("WL-Proxy-Client-IP"); 
	     }
	     if(ip == null || ip.length() == 0) {
	         ip = request.getRemoteAddr() ;
	     }
	     return ip;
	 }
}
