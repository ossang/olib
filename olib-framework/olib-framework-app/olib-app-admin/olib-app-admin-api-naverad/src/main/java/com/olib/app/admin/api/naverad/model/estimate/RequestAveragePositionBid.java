package com.olib.app.admin.api.naverad.model.estimate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestAveragePositionBid {
	private Device device;
	private List<KeyAndPosition> items;
	
	public RequestAveragePositionBid(){}
	
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public List<KeyAndPosition> getItems() {
		return items;
	}
	public void setItems(List<KeyAndPosition> items) {
		this.items = items;
	}	
	
	
}
