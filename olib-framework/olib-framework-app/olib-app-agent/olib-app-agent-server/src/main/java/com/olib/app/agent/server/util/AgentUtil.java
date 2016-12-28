package com.olib.app.agent.server.util;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgentUtil {
	private static Logger accessLogger = LoggerFactory.getLogger("accessLogger");
	
	public static String stackTraceToStringAll(Throwable exception){
		StringBuffer sb = new StringBuffer();
		for(StackTraceElement stackTrace : exception.getStackTrace()){
			sb.append(stackTrace.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void saveAccessLog(HttpServletRequest request,String message){
		StringBuffer sb = new StringBuffer();
		sb.append("[access]");
		sb.append("[").append(getClientIp(request)).append("]");
		sb.append("[").append(message).append("]");
		
		accessLogger.debug(sb.toString());
	}
	
	public static String getClientIp(HttpServletRequest request){
		String ip = request.getHeader("X-FORWARDED-FOR");
		
		if(ip == null || ip.length() == 0){
			ip = request.getHeader("Proxy-Client-IP");
		}
		if(ip == null || ip.length() == 0){
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if(ip == null || ip.length() == 0){
			ip = request.getRemoteAddr();
		}
		return ip;
	}
}
