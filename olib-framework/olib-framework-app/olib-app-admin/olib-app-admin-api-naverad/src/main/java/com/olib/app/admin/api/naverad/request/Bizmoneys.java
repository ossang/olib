package com.olib.app.admin.api.naverad.request;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.model.Bizmoney;
import com.olib.app.admin.api.naverad.util.RestClient;

public class Bizmoneys {

	
	public static String bizmoneyPath = "/billing/bizmoney";

	
	public static Bizmoney get(RestClient rest, int customerId) throws Exception{
		HttpResponse<String> response =
				rest.get(bizmoneyPath, customerId)
						.asString();
		return rest.asObject(response, Bizmoney.class);
	}
}
