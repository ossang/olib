package com.olib.app.admin.api.naverad.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerLink {
	
	private Integer clientCustomerDelFlag;
	private Integer clientCustomerId;
	private Integer clientEnable;
	private String clientLoginId;
	private Integer clientPenaltySt;
	private String customerLinkId;
	private String description;
	private Date editTm;
	private Integer isProxyAgency;
	private Integer linkStatus;													// 10 : 요청중 , 20 : 수락, 40: 거절
	private String managerCompanyName;
	private String managerCustomerDelFlag;
	private Integer managerCustomerId;
	private Integer managerEnable;
	private String managerLoginId;
	private String managerName;
	private Integer managerPenaltySt;
	private Date regTm;
	private Integer roleId;
	public Integer getClientCustomerDelFlag() {
		return clientCustomerDelFlag;
	}
	public void setClientCustomerDelFlag(Integer clientCustomerDelFlag) {
		this.clientCustomerDelFlag = clientCustomerDelFlag;
	}
	public Integer getClientCustomerId() {
		return clientCustomerId;
	}
	public void setClientCustomerId(Integer clientCustomerId) {
		this.clientCustomerId = clientCustomerId;
	}
	public Integer getClientEnable() {
		return clientEnable;
	}
	public void setClientEnable(Integer clientEnable) {
		this.clientEnable = clientEnable;
	}
	public String getClientLoginId() {
		return clientLoginId;
	}
	public void setClientLoginId(String clientLoginId) {
		this.clientLoginId = clientLoginId;
	}
	public Integer getClientPenaltySt() {
		return clientPenaltySt;
	}
	public void setClientPenaltySt(Integer clientPenaltySt) {
		this.clientPenaltySt = clientPenaltySt;
	}
	public String getCustomerLinkId() {
		return customerLinkId;
	}
	public void setCustomerLinkId(String customerLinkId) {
		this.customerLinkId = customerLinkId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getEditTm() {
		return editTm;
	}
	public void setEditTm(Date editTm) {
		this.editTm = editTm;
	}
	public Integer getIsProxyAgency() {
		return isProxyAgency;
	}
	public void setIsProxyAgency(Integer isProxyAgency) {
		this.isProxyAgency = isProxyAgency;
	}
	public Integer getLinkStatus() {
		return linkStatus;
	}
	public void setLinkStatus(Integer linkStatus) {
		this.linkStatus = linkStatus;
	}
	public String getManagerCompanyName() {
		return managerCompanyName;
	}
	public void setManagerCompanyName(String managerCompanyName) {
		this.managerCompanyName = managerCompanyName;
	}
	public String getManagerCustomerDelFlag() {
		return managerCustomerDelFlag;
	}
	public void setManagerCustomerDelFlag(String managerCustomerDelFlag) {
		this.managerCustomerDelFlag = managerCustomerDelFlag;
	}
	public Integer getManagerCustomerId() {
		return managerCustomerId;
	}
	public void setManagerCustomerId(Integer managerCustomerId) {
		this.managerCustomerId = managerCustomerId;
	}
	public Integer getManagerEnable() {
		return managerEnable;
	}
	public void setManagerEnable(Integer managerEnable) {
		this.managerEnable = managerEnable;
	}
	public String getManagerLoginId() {
		return managerLoginId;
	}
	public void setManagerLoginId(String managerLoginId) {
		this.managerLoginId = managerLoginId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public Integer getManagerPenaltySt() {
		return managerPenaltySt;
	}
	public void setManagerPenaltySt(Integer managerPenaltySt) {
		this.managerPenaltySt = managerPenaltySt;
	}
	public Date getRegTm() {
		return regTm;
	}
	public void setRegTm(Date regTm) {
		this.regTm = regTm;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
	
	
}
