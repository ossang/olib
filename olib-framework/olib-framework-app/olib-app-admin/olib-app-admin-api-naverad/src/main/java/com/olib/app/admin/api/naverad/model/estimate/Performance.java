package com.olib.app.admin.api.naverad.model.estimate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Performance {
	private Integer bid;
	private Long clicks;
	private Long impressions;
	private Long cost;
	
	public Performance(){}
	
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Long getClicks() {
		return clicks;
	}
	public void setClicks(Long clicks) {
		this.clicks = clicks;
	}
	public Long getImpressions() {
		return impressions;
	}
	public void setImpressions(Long impressions) {
		this.impressions = impressions;
	}
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	
	
}
