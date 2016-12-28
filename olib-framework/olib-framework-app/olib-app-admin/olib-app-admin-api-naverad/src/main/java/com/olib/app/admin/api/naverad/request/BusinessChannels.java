package com.olib.app.admin.api.naverad.request;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.model.BusinessChannel;
import com.olib.app.admin.api.naverad.util.RestClient;

public class BusinessChannels {

	private static String businessChannelPath = "/ncc/channels";

	public static BusinessChannel get(RestClient rest, int customerId, String businessChannelId) throws Exception{
		HttpResponse<String> response =
				rest.get(businessChannelPath+"/"+businessChannelId, customerId)
						.asString();
		return rest.asObject(response, BusinessChannel.class);
	}

}
