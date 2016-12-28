package com.olib.app.admin.api.naverad.model.estimate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponsePerformanceBulk {
	private List<ResponsePerformanceBulkItem> items;
	
	public ResponsePerformanceBulk(){}

	public List<ResponsePerformanceBulkItem> getItems() {
		return items;
	}
	public void setItems(List<ResponsePerformanceBulkItem> items) {
		this.items = items;
	}
}
