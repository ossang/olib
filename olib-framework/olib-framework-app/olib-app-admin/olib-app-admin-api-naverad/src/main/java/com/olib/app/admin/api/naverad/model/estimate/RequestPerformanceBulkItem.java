package com.olib.app.admin.api.naverad.model.estimate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestPerformanceBulkItem {
	private Device device;
	private Boolean keywordplus;
	private String keyword;
	private Integer bid;
	
	public RequestPerformanceBulkItem(){}

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

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}
}
