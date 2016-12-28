package com.olib.app.admin.api.naverad.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MasterReport {

	private String id;
	private Item item;
	private String fromTime;
	private String updateTime;
	private Status status;
	private String downloadUrl;

	public static enum Item {	
		Campaign,
		CampaignBudget,
		BusinessChannel,
		Adgroup,
		AdgroupBudget,
		Keyword,
		Account,
		Ad,
		AdExtension,
		Qi,
		Label,
		LabelRef,
		Media,
		Biz,
		SeasonalEvent
	}

	public static enum Status {
		REGIST,
		RUNNING,
		BUILT,
		NONE,
		ERROR;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	
	
}
