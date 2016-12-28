package com.olib.app.admin.api.naverad.model;

import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ad {
	private Map<String, Object> ad;
	private Map<String, Object> adAttr;
	private Integer customerId;
	private Date editTm;
	private boolean enable;
	private String inspectRequestMsg;
	private String inspectStatus;
	private String nccAdId;
	private String nccAdgroupId;
	private Date regTm;
	private String status;
	private String statusReason;
	private String type;
	private boolean userLock;
	
	private Map<String, Object> referenceData;
	private String referenceKey;
	private boolean delFlag;
	private Map<String, Object> nccQi;
	
	public Map<String, Object> getAd() {
		return ad;
	}
	public void setAd(Map<String, Object> ad) {
		this.ad = ad;
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
	public String getInspectRequestMsg() {
		return inspectRequestMsg;
	}
	public void setInspectRequestMsg(String inspectRequestMsg) {
		this.inspectRequestMsg = inspectRequestMsg;
	}
	public String getInspectStatus() {
		return inspectStatus;
	}
	public void setInspectStatus(String inspectStatus) {
		this.inspectStatus = inspectStatus;
	}
	public String getNccAdId() {
		return nccAdId;
	}
	public void setNccAdId(String nccAdId) {
		this.nccAdId = nccAdId;
	}
	public String getNccAdgroupId() {
		return nccAdgroupId;
	}
	public void setNccAdgroupId(String nccAdgroupId) {
		this.nccAdgroupId = nccAdgroupId;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isUserLock() {
		return userLock;
	}
	public void setUserLock(boolean userLock) {
		this.userLock = userLock;
	}
	public Map<String, Object> getAdAttr() {
		return adAttr;
	}
	public void setAdAttr(Map<String, Object> adAttr) {
		this.adAttr = adAttr;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public Map<String, Object> getReferenceData() {
		return referenceData;
	}
	public void setReferenceData(Map<String, Object> referenceData) {
		this.referenceData = referenceData;
	}
	public String getReferenceKey() {
		return referenceKey;
	}
	public void setReferenceKey(String referenceKey) {
		this.referenceKey = referenceKey;
	}
	public boolean isDelFlag() {
		return delFlag;
	}
	public void setDelFlag(boolean delFlag) {
		this.delFlag = delFlag;
	}
	public Map<String, Object> getNccQi() {
		return nccQi;
	}
	public void setNccQi(Map<String, Object> nccQi) {
		this.nccQi = nccQi;
	}
}
