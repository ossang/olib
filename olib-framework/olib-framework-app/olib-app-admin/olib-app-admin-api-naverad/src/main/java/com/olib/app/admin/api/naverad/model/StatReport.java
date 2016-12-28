package com.olib.app.admin.api.naverad.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatReport {
	private Integer reportJobId;
	private String reportTp;
	private String status;
	private String downloadUrl;
	private String statDt;
	private String updateTm;
	public Integer getReportJobId() {
		return reportJobId;
	}
	public void setReportJobId(Integer reportJobId) {
		this.reportJobId = reportJobId;
	}
	public String getReportTp() {
		return reportTp;
	}
	public void setReportTp(String reportTp) {
		this.reportTp = reportTp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getStatDt() {
		return statDt;
	}
	public void setStatDt(String statDt) {
		this.statDt = statDt;
	}
	public String getUpdateTm() {
		return updateTm;
	}
	public void setUpdateTm(String updateTm) {
		this.updateTm = updateTm;
	}
	
	
}
