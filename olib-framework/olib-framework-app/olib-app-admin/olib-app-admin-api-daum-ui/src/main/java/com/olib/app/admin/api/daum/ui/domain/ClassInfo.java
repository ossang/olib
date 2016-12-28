package com.olib.app.admin.api.daum.ui.domain;

import java.util.List;

public class ClassInfo {

	private String name;
	private List<MethodInfo> methodList;
	
	public ClassInfo(){}
	
	public ClassInfo(String name, List<MethodInfo> methodList) {
		this.name = name;
		this.methodList = methodList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MethodInfo> getMethodList() {
		return methodList;
	}
	public void setMethodList(List<MethodInfo> methodList) {
		this.methodList = methodList;
	}
	
	
	
}
