package com.olib.app.admin.api.naverad.model;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Adgroup {
	private Integer bidAmt;
	private boolean budgetLock;
	private Integer contentsNetworkBidAmt;
	private Integer customerId;
	private Integer dailyBudget;
	private Date editTm;
	private Integer keywordPlusWeight;
	private String mobileChannelId;
	private Integer mobileNetworkBidWeight;
	private String name;
	private String nccAdgroupId;
	private String nccCampaignId;
	private String pcChannelId;
	private Integer pcNetworkBidWeight;
	private Date regTm;
	private String status;
	private String statusReason;
	private Target[] targets; 
	private boolean useCntsNetworkBidAmt;
	private boolean useDailyBudget;
	private boolean useKeywordPlus;
	private boolean userLock;
	
	private Map<String, Object> targetSummary;
	private String pcChannelKey;
	private String mobileChannelKey;
	private Integer expectCost;
	private Integer migType;
	public Integer getBidAmt() {
		return bidAmt;
	}
	public void setBidAmt(Integer bidAmt) {
		this.bidAmt = bidAmt;
	}
	public Integer getContentsNetworkBidAmt() {
		return contentsNetworkBidAmt;
	}
	public void setContentsNetworkBidAmt(Integer contentsNetworkBidAmt) {
		this.contentsNetworkBidAmt = contentsNetworkBidAmt;
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
	public Date getEditTm() {
		return editTm;
	}
	public void setEditTm(Date editTm) {
		this.editTm = editTm;
	}
	public Integer getKeywordPlusWeight() {
		return keywordPlusWeight;
	}
	public void setKeywordPlusWeight(Integer keywordPlusWeight) {
		this.keywordPlusWeight = keywordPlusWeight;
	}
	public String getMobileChannelId() {
		return mobileChannelId;
	}
	public void setMobileChannelId(String mobileChannelId) {
		this.mobileChannelId = mobileChannelId;
	}
	public Integer getMobileNetworkBidWeight() {
		return mobileNetworkBidWeight;
	}
	public void setMobileNetworkBidWeight(Integer mobileNetworkBidWeight) {
		this.mobileNetworkBidWeight = mobileNetworkBidWeight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPcChannelId() {
		return pcChannelId;
	}
	public void setPcChannelId(String pcChannelId) {
		this.pcChannelId = pcChannelId;
	}
	public Integer getPcNetworkBidWeight() {
		return pcNetworkBidWeight;
	}
	public void setPcNetworkBidWeight(Integer pcNetworkBidWeight) {
		this.pcNetworkBidWeight = pcNetworkBidWeight;
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
	public Target[] getTargets() {
		return targets;
	}
	public void setTargets(Target[] targets) {
		this.targets = targets;
	}
	public boolean isUserLock() {
		return userLock;
	}
	public void setUserLock(boolean userLock) {
		this.userLock = userLock;
	}
	public boolean isUseDailyBudget() {
		return useDailyBudget;
	}
	public void setUseDailyBudget(boolean useDailyBudget) {
		this.useDailyBudget = useDailyBudget;
	}
	public boolean isBudgetLock() {
		return budgetLock;
	}
	public void setBudgetLock(boolean budgetLock) {
		this.budgetLock = budgetLock;
	}
	public boolean isUseKeywordPlus() {
		return useKeywordPlus;
	}
	public void setUseKeywordPlus(boolean useKeywordPlus) {
		this.useKeywordPlus = useKeywordPlus;
	}
	public boolean isUseCntsNetworkBidAmt() {
		return useCntsNetworkBidAmt;
	}
	public void setUseCntsNetworkBidAmt(boolean useCntsNetworkBidAmt) {
		this.useCntsNetworkBidAmt = useCntsNetworkBidAmt;
	}
	public Map<String, Object> getTargetSummary() {
		return targetSummary;
	}
	public void setTargetSummary(Map<String, Object> targetSummary) {
		this.targetSummary = targetSummary;
	}
	public String getPcChannelKey() {
		return pcChannelKey;
	}
	public void setPcChannelKey(String pcChannelKey) {
		this.pcChannelKey = pcChannelKey;
	}
	public String getMobileChannelKey() {
		return mobileChannelKey;
	}
	public void setMobileChannelKey(String mobileChannelKey) {
		this.mobileChannelKey = mobileChannelKey;
	}
	public Integer getExpectCost() {
		return expectCost;
	}
	public void setExpectCost(Integer expectCost) {
		this.expectCost = expectCost;
	}
	public Integer getMigType() {
		return migType;
	}
	public void setMigType(Integer migType) {
		this.migType = migType;
	}
	
}
