package com.olib.app.admin.api.naverad.request;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.model.estimate.Bid;
import com.olib.app.admin.api.naverad.model.estimate.IDType;
import com.olib.app.admin.api.naverad.model.estimate.RequestAveragePositionBid;
import com.olib.app.admin.api.naverad.model.estimate.RequestExposureMinimumBid;
import com.olib.app.admin.api.naverad.model.estimate.RequestMedianBid;
import com.olib.app.admin.api.naverad.model.estimate.RequestPerformance;
import com.olib.app.admin.api.naverad.model.estimate.RequestPerformanceBulk;
import com.olib.app.admin.api.naverad.model.estimate.ResponseAveragePositionBid;
import com.olib.app.admin.api.naverad.model.estimate.ResponsePerformance;
import com.olib.app.admin.api.naverad.model.estimate.ResponsePerformanceBulk;
import com.olib.app.admin.api.naverad.util.RestClient;

public class Estimate {
	public static ResponseAveragePositionBid getAveragePositionBid(RestClient rest, int customerId, IDType type, RequestAveragePositionBid req) throws Exception {
		HttpResponse<String> response =
				rest.post("/estimate/average-position-bid/" + type, customerId)
						.body(req)
						.asString();
		return rest.asObject(response, ResponseAveragePositionBid.class);
	}

	public static Bid[] getMedianBid(RestClient rest, int customerId, IDType type, RequestMedianBid req) throws Exception {
		HttpResponse<String> response =
				rest.post("/estimate/median-bid/" + type, customerId)
						.body(req)
						.asString();
		return rest.asObject(response, Bid[].class);
	}

	public static Bid[] getExposureMinimumBid(RestClient rest, int customerId, IDType type, RequestExposureMinimumBid req) throws Exception {
		HttpResponse<String> response =
				rest.post("/estimate/exposure-minimum-bid/" + type, customerId)
						.body(req)
						.asString();
		return rest.asObject(response, Bid[].class);
	}

	public static ResponsePerformance getPerformance(RestClient rest, int customerId, IDType type, RequestPerformance req) throws Exception {
		HttpResponse<String> response =
				rest.post("/estimate/performance/" + type, customerId)
						.body(req)
						.asString();
		return rest.asObject(response, ResponsePerformance.class);
	}
	
	public static ResponsePerformanceBulk getPerformanceBulk(RestClient rest,int customerId, RequestPerformanceBulk req) throws Exception {
		HttpResponse<String> response =
				rest.post("/estimate/performance-bulk",customerId)
				.body(req)
				.asString();
		return rest.asObject(response, ResponsePerformanceBulk.class);
	}
}
