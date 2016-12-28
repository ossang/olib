package com.olib.app.admin.api.naverad.domain;


public class ApiException extends Exception{
	
	public static String CODE = "code";
	public static String MESSAGE = "title";
	public static String STATUS = "status";
	
	private int status;
	private String statusText;
	private String transactionId;
	private String responseBody;
	private String code;
	private String message;
	
	public ApiException(){}
	
	public ApiException(String statusText){
		this.statusText = statusText;
		this.code="";
		this.responseBody="";
		this.message="";
	}
	
	public ApiException(
			int status, 
			String statusText, 
			String transactionId,
			String responseBody,
			String code,
			String message) {
		
		this.status = status;
		this.statusText = statusText;
		this.transactionId = transactionId;
		this.responseBody = responseBody;
		this.code = code;
		this.message = message;
	}


	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusText() {
		return statusText;
	}
	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
