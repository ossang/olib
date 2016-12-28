package com.olib.app.admin.api.naverad.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessChannel {
	private String adultStatus;
	private String blackStatus;
	private Object businessInfo;
	private String channelKey;
	private String channelTp;
	private Integer customerId;
	private Date datetime;
	private boolean enabled;
	private Date firstChargeTm;
	private String inspectRequestMsg;
	private Date inspectRequestTm;
	private Date inspectTm;
	private String mobileInspectStatus;
	private String name;
	private String nccBusinessChannelId; 
	private String pcInspectStatus; 
	private Date regTm; 
	private String status; 
	private String statusReason;
	public String getAdultStatus() {
		return adultStatus;
	}
	public void setAdultStatus(String adultStatus) {
		this.adultStatus = adultStatus;
	}
	public String getBlackStatus() {
		return blackStatus;
	}
	public void setBlackStatus(String blackStatus) {
		this.blackStatus = blackStatus;
	}
	public Object getBusinessInfo() {
		return businessInfo;
	}
	public void setBusinessInfo(Object businessInfo) {
		this.businessInfo = businessInfo;
	}
	public String getChannelKey() {
		return channelKey;
	}
	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}
	public String getChannelTp() {
		return channelTp;
	}
	public void setChannelTp(String channelTp) {
		this.channelTp = channelTp;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Date getFirstChargeTm() {
		return firstChargeTm;
	}
	public void setFirstChargeTm(Date firstChargeTm) {
		this.firstChargeTm = firstChargeTm;
	}
	public String getInspectRequestMsg() {
		return inspectRequestMsg;
	}
	public void setInspectRequestMsg(String inspectRequestMsg) {
		this.inspectRequestMsg = inspectRequestMsg;
	}
	public Date getInspectRequestTm() {
		return inspectRequestTm;
	}
	public void setInspectRequestTm(Date inspectRequestTm) {
		this.inspectRequestTm = inspectRequestTm;
	}
	public Date getInspectTm() {
		return inspectTm;
	}
	public void setInspectTm(Date inspectTm) {
		this.inspectTm = inspectTm;
	}
	public String getMobileInspectStatus() {
		return mobileInspectStatus;
	}
	public void setMobileInspectStatus(String mobileInspectStatus) {
		this.mobileInspectStatus = mobileInspectStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNccBusinessChannelId() {
		return nccBusinessChannelId;
	}
	public void setNccBusinessChannelId(String nccBusinessChannelId) {
		this.nccBusinessChannelId = nccBusinessChannelId;
	}
	public String getPcInspectStatus() {
		return pcInspectStatus;
	}
	public void setPcInspectStatus(String pcInspectStatus) {
		this.pcInspectStatus = pcInspectStatus;
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
}
