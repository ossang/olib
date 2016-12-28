package com.olib.app.admin.api.naverad.domain;


/*
 * 네이버 api 통신을 위한 기본 정보
 */
public class ApiParams {
	private String accessLicense;												// 라이센스
	private String secretKey;													// 비밀키
	private int customerId;													// 광고주 ID
	
	public ApiParams(){}
	
	public ApiParams(String accessLicense, String secretKey, int customerId) {
		this.accessLicense = accessLicense;
		this.secretKey = secretKey;
		this.customerId = customerId;
	}

	public String getAccessLicense() {
		return accessLicense;
	}
	public void setAccessLicense(String accessLicense) {
		this.accessLicense = accessLicense;
	}
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}
