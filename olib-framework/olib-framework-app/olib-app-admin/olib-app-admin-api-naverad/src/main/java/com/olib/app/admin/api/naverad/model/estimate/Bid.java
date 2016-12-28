package com.olib.app.admin.api.naverad.model.estimate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bid {
	private String keyword;
	private String nccKeywordId;
	private Integer bid;
	
	public Bid(){}
	
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
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	
	
}
