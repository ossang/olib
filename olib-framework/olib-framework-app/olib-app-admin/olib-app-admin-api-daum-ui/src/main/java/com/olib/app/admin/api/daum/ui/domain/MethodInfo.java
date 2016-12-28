package com.olib.app.admin.api.daum.ui.domain;


public class MethodInfo {

	private String name;
	private String[] parameterNames;
	private Object[] parameterTypes;
	private Object returnType;
	
	public MethodInfo(){}
	

	public MethodInfo(String name, String[] parameterNames,
			Object[] parameterTypes, Object returnType) {
		this.name = name;
		this.parameterNames = parameterNames;
		this.parameterTypes = parameterTypes;
		this.returnType = returnType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getParameterNames() {
		return parameterNames;
	}

	public void setParameterNames(String[] parameterNames) {
		this.parameterNames = parameterNames;
	}

	public Object[] getParameterTypes() {
		return parameterTypes;
	}

	public void setParameterTypes(Object[] parameterTypes) {
		this.parameterTypes = parameterTypes;
	}

	public Object getReturnType() {
		return returnType;
	}

	public void setReturnType(Object returnType) {
		this.returnType = returnType;
	}
	
}
