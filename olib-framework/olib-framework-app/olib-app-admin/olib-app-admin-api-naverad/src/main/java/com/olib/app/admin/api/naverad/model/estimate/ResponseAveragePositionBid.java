package com.olib.app.admin.api.naverad.model.estimate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseAveragePositionBid {
	private Device device;
	private List<EstiamteBidByPosition> estimate;
	
	public ResponseAveragePositionBid(){}
	
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public List<EstiamteBidByPosition> getEstimate() {
		return estimate;
	}
	public void setEstimate(List<EstiamteBidByPosition> estimate) {
		this.estimate = estimate;
	}
	
}
