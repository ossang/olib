package com.olib.app.admin.api.naverad.model.estimate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EstiamteBidByPosition {
	private String keyword;
	private Integer position;
	private String nccKeywordId;
	private Integer bid;
	
	public EstiamteBidByPosition(){}
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
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
