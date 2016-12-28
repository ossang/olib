package com.olib.app.admin.api.naverad.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Campaign {
	private String campaignTp;
	private Integer customerId;
	private Integer dailyBudget;
	private String deliveryMethod;
	private Date editTm;
	private String name;
	private String nccCampaignId;
	private Date periodEndDt;
	private Date periodStartDt;
	private Date regTm;
	private String status;
	private String statusReason;
	private String trackingMode;
	private String trackingUrl;
	private boolean useDailyBudget;
	private boolean usePeriod;
	private boolean userLock;
	private boolean delFlag;
	private Integer expectCost;
	public String getCampaignTp() {
		return campaignTp;
	}
	public void setCampaignTp(String campaignTp) {
		this.campaignTp = campaignTp;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getDailyBudget() {
		return dailyBudget;
	}
	public void setDailyBudget(Integer dailyBudget) {
		this.dailyBudget = dailyBudget;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public Date getEditTm() {
		return editTm;
	}
	public void setEditTm(Date editTm) {
		this.editTm = editTm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNccCampaignId() {
		return nccCampaignId;
	}
	public void setNccCampaignId(String nccCampaignId) {
		this.nccCampaignId = nccCampaignId;
	}
	public Date getPeriodEndDt() {
		return periodEndDt;
	}
	public void setPeriodEndDt(Date periodEndDt) {
		this.periodEndDt = periodEndDt;
	}
	public Date getPeriodStartDt() {
		return periodStartDt;
	}
	public void setPeriodStartDt(Date periodStartDt) {
		this.periodStartDt = periodStartDt;
	}
	public Date getRegTm() {
		return regTm;
	}
	public void setRegTm(Date regTm) {
		this.regTm = regTm;
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
	public String getTrackingMode() {
		return trackingMode;
	}
	public void setTrackingMode(String trackingMode) {
		this.trackingMode = trackingMode;
	}
	public String getTrackingUrl() {
		return trackingUrl;
	}
	public void setTrackingUrl(String trackingUrl) {
		this.trackingUrl = trackingUrl;
	}
	public boolean isUseDailyBudget() {
		return useDailyBudget;
	}
	public void setUseDailyBudget(boolean useDailyBudget) {
		this.useDailyBudget = useDailyBudget;
	}
	public boolean isUsePeriod() {
		return usePeriod;
	}
	public void setUsePeriod(boolean usePeriod) {
		this.usePeriod = usePeriod;
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
	public Integer getExpectCost() {
		return expectCost;
	}
	public void setExpectCost(Integer expectCost) {
		this.expectCost = expectCost;
	}
	
}
