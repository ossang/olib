package com.olib.app.admin.api.naverad.request;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.model.Campaign;
import com.olib.app.admin.api.naverad.util.RestClient;

public class Campaigns {

	private static String apiPath = "/ncc/campaigns";
	
	public static Campaign[] list(RestClient rest, int customerId) throws Exception {
		HttpResponse<String> response = rest.get(apiPath, customerId).asString();
		return rest.asObject(response, Campaign[].class);
	}

	public static Campaign getCampaign(RestClient rest, int customerId, String campaignId) throws Exception {
		HttpResponse<String> response = rest.get(apiPath+"/"+campaignId, customerId).asString();
		return rest.asObject(response, Campaign.class);
	}
	
}
