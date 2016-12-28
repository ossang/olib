package com.olib.app.admin.api.naverad.model;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Keyword {
	public static enum Status{PAUSED,ELIGIBLE}
	
	private Integer bidAmt;
	private Integer customerId;
	private Date editTm;
	private String inspectStatus;
	private String keyword;
	private Map<String, Object> links;
	private ManagedKeyword managedKeyword;
	private String nccAdgroupId;
	private String nccCampaignId;
	private String nccKeywordId;
	private NccQi nccQi;
	private Date regTm;
	private ResultStatus resultStatus;
	private String status;														// PAUSED : 키워드 OFF , ELIGIBLE : 키워드 ON
	private String statusReason;
	private boolean useGroupBidAmt;
	private boolean userLock;
	private boolean delFlag;
	public Integer getBidAmt() {
		return bidAmt;
	}
	public void setBidAmt(Integer bidAmt) {
		this.bidAmt = bidAmt;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Date getEditTm() {
		return editTm;
	}
	public void setEditTm(Date editTm) {
		this.editTm = editTm;
	}
	public String getInspectStatus() {
		return inspectStatus;
	}
	public void setInspectStatus(String inspectStatus) {
		this.inspectStatus = inspectStatus;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Map<String, Object> getLinks() {
		return links;
	}
	public void setLinks(Map<String, Object> links) {
		this.links = links;
	}
	public ManagedKeyword getManagedKeyword() {
		return managedKeyword;
	}
	public void setManagedKeyword(ManagedKeyword managedKeyword) {
		this.managedKeyword = managedKeyword;
	}
	public String getNccAdgroupId() {
		return nccAdgroupId;
	}
	public void setNccAdgroupId(String nccAdgroupId) {
		this.nccAdgroupId = nccAdgroupId;
	}
	public String getNccCampaignId() {
		return nccCampaignId;
	}
	public void setNccCampaignId(String nccCampaignId) {
		this.nccCampaignId = nccCampaignId;
	}
	public String getNccKeywordId() {
		return nccKeywordId;
	}
	public void setNccKeywordId(String nccKeywordId) {
		this.nccKeywordId = nccKeywordId;
	}
	public NccQi getNccQi() {
		return nccQi;
	}
	public void setNccQi(NccQi nccQi) {
		this.nccQi = nccQi;
	}
	public Date getRegTm() {
		return regTm;
	}
	public void setRegTm(Date regTm) {
		this.regTm = regTm;
	}
	public ResultStatus getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(ResultStatus resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}
	public boolean isUseGroupBidAmt() {
		return useGroupBidAmt;
	}
	public void setUseGroupBidAmt(boolean useGroupBidAmt) {
		this.useGroupBidAmt = useGroupBidAmt;
	}
	public boolean isUserLock() {
		return userLock;
	}
	public void setUserLock(boolean userLock) {
		this.userLock = userLock;
	}
	public boolean isDelFlag() {
		return delFlag;
	}
	public void setDelFlag(boolean delFlag) {
		this.delFlag = delFlag;
	}
	
}
