package com.olib.app.admin.api.naverad.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bizmoney {

	private Integer bizmoney;
	private boolean budgetLock;
	private Integer customerId;
	private boolean refundLock;
	
	public Integer getBizmoney() {
		return bizmoney;
	}
	public void setBizmoney(Integer bizmoney) {
		this.bizmoney = bizmoney;
	}
	public boolean isBudgetLock() {
		return budgetLock;
	}
	public void setBudgetLock(boolean budgetLock) {
		this.budgetLock = budgetLock;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public boolean isRefundLock() {
		return refundLock;
	}
	public void setRefundLock(boolean refundLock) {
		this.refundLock = refundLock;
	}
	
}
