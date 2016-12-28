package com.olib.core.util;

public class OlibExceptionUtil {
	
	// exception message to string
	public static String stackTraceToStringAll(Throwable exception){
		StringBuffer sb = new StringBuffer();
		for(StackTraceElement stackTrace : exception.getStackTrace()){
			sb.append(stackTrace.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	// exception message to string 
	public static String stackTraceToString(Throwable exception){
		StringBuffer sb = new StringBuffer();
		
		StackTraceElement[] stackTrace = exception.getStackTrace();
		if(stackTrace.length > 0){
			sb.append(stackTrace[0].getFileName()).append(" -> ");
			sb.append(stackTrace[0].getClassName()).append(" -> ");
			sb.append(stackTrace[0].getMethodName()).append(" -> ");
			sb.append(stackTrace[0].getLineNumber()).append(" line.");
		}
		return sb.toString();
	}
}
