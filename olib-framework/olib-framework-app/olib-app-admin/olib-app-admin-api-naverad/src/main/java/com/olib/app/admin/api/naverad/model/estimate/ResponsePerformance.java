package com.olib.app.admin.api.naverad.model.estimate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponsePerformance {
	private Device device;
	private Boolean keywordplus;
	private String keyword;
	private String nccKeywordId;
	private List<Performance> estiamte;
	
	public ResponsePerformance(){}
	
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
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getNccKeywordId() {
		return nccKeywordId;
	}
	public void setNccKeywordId(String nccKeywordId) {
		this.nccKeywordId = nccKeywordId;
	}
	public List<Performance> getEstiamte() {
		return estiamte;
	}
	public void setEstiamte(List<Performance> estiamte) {
		this.estiamte = estiamte;
	}
	
}
