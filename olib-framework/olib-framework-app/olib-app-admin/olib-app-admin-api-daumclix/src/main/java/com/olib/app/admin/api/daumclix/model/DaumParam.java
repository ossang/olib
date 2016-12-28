package com.olib.app.admin.api.daumclix.model;

public class DaumParam {

	private String id;
	private String password;
	
	public DaumParam(){}

	public DaumParam(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
