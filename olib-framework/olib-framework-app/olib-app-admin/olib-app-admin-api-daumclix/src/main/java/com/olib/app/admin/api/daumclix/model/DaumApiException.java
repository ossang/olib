package com.olib.app.admin.api.daumclix.model;

public class DaumApiException extends Exception{

	private String message;
	
	public DaumApiException(){}
	public DaumApiException(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
