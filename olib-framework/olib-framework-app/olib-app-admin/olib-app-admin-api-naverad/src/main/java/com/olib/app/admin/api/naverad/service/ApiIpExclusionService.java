package com.olib.app.admin.api.naverad.service;

import org.springframework.stereotype.Service;

import com.olib.app.admin.api.naverad.domain.ApiPath;
import com.olib.app.admin.api.naverad.model.IpExclusion;
import com.olib.app.admin.api.naverad.request.IpExclusions;
import com.olib.app.admin.api.naverad.util.RestClient;

@Service
public class ApiIpExclusionService {

	public IpExclusion[] get(
			String apiKey, 
			String secretKey, 
			int customerId) throws Exception{
		
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return IpExclusions.get(rest, customerId);
	}
	
	public IpExclusion create(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String filterIp, 
			String memo) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return IpExclusions.create(rest, customerId, filterIp, memo);
	}
	
	public IpExclusion update(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String filterIp, 
			long ipFilterId, 
			String memo) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return IpExclusions.update(rest, customerId, filterIp, ipFilterId, memo);
	}
	
	public IpExclusion delete(
			String apiKey, 
			String secretKey, 
			int customerId, 
			long id) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return IpExclusions.delete(rest, customerId, id);
	}
	
}
