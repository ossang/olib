package com.olib.app.admin.api.naverad.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Target {
	private Date editTm;
	private String ownerId;
	private String nccTargetId;
	private Date regTm;
	private Object target;
	private String targetTp;
	
	public Date getEditTm() {
		return editTm;
	}
	public void setEditTm(Date editTm) {
		this.editTm = editTm;
	}
	public String getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	public String getNccTargetId() {
		return nccTargetId;
	}
	public void setNccTargetId(String nccTargetId) {
		this.nccTargetId = nccTargetId;
	}
	public Date getRegTm() {
		return regTm;
	}
	public void setRegTm(Date regTm) {
		this.regTm = regTm;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public String getTargetTp() {
		return targetTp;
	}
	public void setTargetTp(String targetTp) {
		this.targetTp = targetTp;
	}
}
