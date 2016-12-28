package com.olib.app.admin.log.model.browser;

import java.util.Map;

public class CustomFilterSearch {

	private String keyword;
	private String dateFormat;
	private String dateStart;
	private String dateEnd;
	private String path;
	private int currentPage;
	
	private Map<String, String> replaceMap;
	
	public CustomFilterSearch(){}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public Map<String, String> getReplaceMap() {
		return replaceMap;
	}

	public void setReplaceMap(Map<String, String> replaceMap) {
		this.replaceMap = replaceMap;
	}
}
