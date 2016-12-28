package com.olib.app.admin.api.naverad.request;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.model.StatReport;
import com.olib.app.admin.api.naverad.util.RestClient;

public class StatReports {

	/*
	 * 리포트 요청 POST /stat-reports 리포트 조회 GET /stat-reports/{reportJobId}
	 */

	// create
	public static StatReport create(RestClient rest, int customerId, String reportType, String statDate) throws Exception {
		HttpResponse<String> response = rest.post("/stat-reports", customerId)
				.header("Content-Type", "application/json")
				.body("{\"reportTp\":\"" + reportType + "\", \"statDt\":\"" + statDate + "\"}")
				.asString();

		return rest.asObject(response, StatReport.class);
	}

	// get
	public static StatReport get(RestClient rest, int customerId, long reportJobId) throws Exception {
		HttpResponse<String> response = rest.get("/stat-reports/"+reportJobId, customerId)
				.asString();

		return rest.asObject(response, StatReport.class);
	}
	
	// list
	public static StatReport[] list(RestClient rest, int customerId) throws Exception {
		HttpResponse<String> response = rest.get("/stat-reports", customerId)
				.asString();
		
		return rest.asObject(response, StatReport[].class);
	}
	
	// delete
	public static void delete(RestClient rest, int customerId, String reportJobId) throws Exception {
		HttpResponse<String> response = rest.delete("/stat-reports/"+reportJobId, customerId)
				.asString();
		
		rest.asObject(response, StatReport.class);
	}

	
}
