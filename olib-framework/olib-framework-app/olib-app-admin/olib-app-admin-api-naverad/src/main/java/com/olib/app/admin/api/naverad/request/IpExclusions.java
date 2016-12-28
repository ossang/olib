package com.olib.app.admin.api.naverad.request;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.model.IpExclusion;
import com.olib.app.admin.api.naverad.util.RestClient;

public class IpExclusions {

	public static String path = "/tool/ip-exclusions";
	
	public static IpExclusion[] get(RestClient rest,int customerId) throws Exception{
		HttpResponse<String> response =
				rest.get(path,customerId).asString();
		return rest.asObject(response, IpExclusion[].class);
	}
	
	public static IpExclusion create(RestClient rest,int customerId, String filterIp, String memo) throws Exception{
		IpExclusion ipExclusion = new IpExclusion();
		ipExclusion.setFilterIp(filterIp);
		ipExclusion.setMemo(memo);
		
		HttpResponse<String> response =
				rest.post(path,customerId)
				.body(ipExclusion)
				.asString();
		return rest.asObject(response, IpExclusion.class);
	}
	
	public static IpExclusion update(RestClient rest,int customerId, String filterIp, long ipFilterId, String memo) throws Exception{
		IpExclusion ipExclusion = new IpExclusion();
		ipExclusion.setFilterIp(filterIp);
		ipExclusion.setIpFilterId(ipFilterId);
		ipExclusion.setMemo(memo);
		
		HttpResponse<String> response =
				rest.put(path,customerId)
				.body(ipExclusion)
				.asString();
		return rest.asObject(response, IpExclusion.class);
	}
	
	public static IpExclusion delete(RestClient rest,int customerId, long id) throws Exception{
		HttpResponse<String> response =
				rest.delete(path+"/"+id,customerId)
				.asString();
		return rest.asObject(response, IpExclusion.class);
	}
	
	
}
