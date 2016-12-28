package com.olib.app.admin.api.naverad.request;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.model.MasterReport;
import com.olib.app.admin.api.naverad.util.RestClient;

public class MasterReports {
	public static MasterReport createDeltaMasterReportJob(RestClient rest, int customerId, MasterReport.Item item, String fromTime) throws Exception {
		MasterReport job = new MasterReport();
		job.setItem(item);
		job.setFromTime(fromTime);
		HttpResponse<String> response =
				rest.post("/master-reports", customerId)
						.body(job)
						.asString();
		return rest.asObject(response, MasterReport.class);
	}

	public static MasterReport createFullMasterReportJob(RestClient rest, int customerId, MasterReport.Item item) throws Exception {
		MasterReport job = new MasterReport();
		job.setItem(item);
		HttpResponse<String> response =
				rest.post("/master-reports", customerId)
						.body(job)
						.asString();
		return rest.asObject(response, MasterReport.class);
	}

	public static MasterReport[] getListOfMasterReportJobs(RestClient rest, int customerId) throws Exception {
		HttpResponse<String> response =
				rest.get("/master-reports", customerId)
						.asString();
		return rest.asObject(response, MasterReport[].class);
	}

	public static MasterReport getMasterReportJob(RestClient rest, int customerId, String id) throws Exception {
		HttpResponse<String> response =
				rest.get("/master-reports/" + id, customerId)
						.asString();
		return rest.asObject(response, MasterReport.class);
	}

	public static String deleteAllMasterReportJobs(RestClient rest, int customerId) throws Exception {
		HttpResponse<String> response =
				rest.delete("/master-reports", customerId)
						.asString();
		return rest.asObject(response, String.class);
	}

	public static String deleteMasterReportJob(RestClient rest, int customerId, String id) throws Exception {
		HttpResponse<String> response =
				rest.delete("/master-reports/" + id, customerId)
						.asString();
		return rest.asObject(response, String.class);
	}
}
