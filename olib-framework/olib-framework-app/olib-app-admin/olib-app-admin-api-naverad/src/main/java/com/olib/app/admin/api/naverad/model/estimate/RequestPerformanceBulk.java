package com.olib.app.admin.api.naverad.model.estimate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestPerformanceBulk {
	private List<RequestPerformanceBulkItem> items;
	
	public RequestPerformanceBulk(){}

	public List<RequestPerformanceBulkItem> getItems() {
		return items;
	}

	public void setItems(List<RequestPerformanceBulkItem> items) {
		this.items = items;
	}

}
