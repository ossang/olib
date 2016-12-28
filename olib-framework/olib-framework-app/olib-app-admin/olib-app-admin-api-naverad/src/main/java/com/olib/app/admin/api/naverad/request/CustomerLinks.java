package com.olib.app.admin.api.naverad.request;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.model.CustomerLink;
import com.olib.app.admin.api.naverad.util.RestClient;

public class CustomerLinks {

	public static CustomerLink[] list(RestClient rest, int customerId) throws Exception {
		HttpResponse<String> response =
				rest.get("/customer-links", customerId)
						.asString();

		return rest.asObject(response, CustomerLink[].class);
	}

	public static CustomerLink[] list(RestClient rest, int customerId, String type) throws Exception {
		HttpResponse<String> response =
				rest.get("/customer-links", customerId)
						.queryString("type", type)
						.asString();
		
		return rest.asObject(response, CustomerLink[].class);
	}
}
