package com.olib.app.admin.api.naverad.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ManagedKeyword {
	private boolean isAdult;
	private boolean isBrand;
	private boolean isRestricted;
	private boolean isSeason;
	private boolean isSellProhibit;
	private boolean isShoppingMall;
	private boolean isLowSearchVolume;
	private Integer pCPLMaxDepth;
	public boolean isAdult() {
		return isAdult;
	}
	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}
	public boolean isBrand() {
		return isBrand;
	}
	public void setBrand(boolean isBrand) {
		this.isBrand = isBrand;
	}
	public boolean isRestricted() {
		return isRestricted;
	}
	public void setRestricted(boolean isRestricted) {
		this.isRestricted = isRestricted;
	}
	public boolean isSeason() {
		return isSeason;
	}
	public void setSeason(boolean isSeason) {
		this.isSeason = isSeason;
	}
	public boolean isSellProhibit() {
		return isSellProhibit;
	}
	public void setSellProhibit(boolean isSellProhibit) {
		this.isSellProhibit = isSellProhibit;
	}
	public boolean isShoppingMall() {
		return isShoppingMall;
	}
	public void setShoppingMall(boolean isShoppingMall) {
		this.isShoppingMall = isShoppingMall;
	}
	public boolean isLowSearchVolume() {
		return isLowSearchVolume;
	}
	public void setLowSearchVolume(boolean isLowSearchVolume) {
		this.isLowSearchVolume = isLowSearchVolume;
	}
	public Integer getpCPLMaxDepth() {
		return pCPLMaxDepth;
	}
	public void setpCPLMaxDepth(Integer pCPLMaxDepth) {
		this.pCPLMaxDepth = pCPLMaxDepth;
	}
	
}