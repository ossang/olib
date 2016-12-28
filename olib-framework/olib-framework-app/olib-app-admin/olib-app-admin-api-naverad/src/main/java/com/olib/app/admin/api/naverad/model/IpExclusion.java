package com.olib.app.admin.api.naverad.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IpExclusion {

	private Long customerId;
	private String filterIp;
	private Long ipFilterId;
	private String loginId;
	private String memo;
	private Date regTm;
	private Long userId;
	
	public IpExclusion(){}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFilterIp() {
		return filterIp;
	}

	public void setFilterIp(String filterIp) {
		this.filterIp = filterIp;
	}

	public Long getIpFilterId() {
		return ipFilterId;
	}

	public void setIpFilterId(Long ipFilterId) {
		this.ipFilterId = ipFilterId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getRegTm() {
		return regTm;
	}

	public void setRegTm(Date regTm) {
		this.regTm = regTm;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
