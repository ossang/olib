package com.olib.app.admin.api.naverad.model.estimate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestPerformance {
	private Device device;
	private Boolean keywordplus;
	private String key;
	private List<Integer> bids;
	
	public RequestPerformance(){}
	
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public Boolean getKeywordplus() {
		return keywordplus;
	}
	public void setKeywordplus(Boolean keywordplus) {
		this.keywordplus = keywordplus;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Integer> getBids() {
		return bids;
	}
	public void setBids(List<Integer> bids) {
		this.bids = bids;
	}
	
}
