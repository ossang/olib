package com.olib.app.admin.api.naverad.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NccQi {
	private Integer qiGrade;

	public Integer getQiGrade() {
		return qiGrade;
	}

	public void setQiGrade(Integer qiGrade) {
		this.qiGrade = qiGrade;
	}
	
}