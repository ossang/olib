package com.olib.app.admin.api.naverad.request;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.model.Keyword;
import com.olib.app.admin.api.naverad.util.RestClient;

public class Keywords {
	public static String SELECTOR_PREVIOUS = "PREVIOUS";
	public static String SELECTOR_NEXT = "NEXT";
	
	/*
	키워드 목록 조회 GET /ncc/keywords{?nccAdgroupId}
	키워드 생성 GET /ncc/keywords{?nccAdgroupId}
	키워드 수정 GET /ncc/keywords{?nccAdgroupId}
	  */
	public static String keywordsPath = "/ncc/keywords";

	
	public static Keyword getKeyword(RestClient rest, int customerId, String keywordId) throws Exception{
		HttpResponse<String> response =
				rest.get(keywordsPath+"/"+keywordId, customerId)
						.asString();
		return rest.asObject(response, Keyword.class);
	}
	
	public static Keyword[] listByAdgroupId(RestClient rest, int customerId, String adgroupId) throws Exception {
		HttpResponse<String> response =
				rest.get(keywordsPath, customerId)
						.queryString("nccAdgroupId", adgroupId)
						.asString();
		return rest.asObject(response, Keyword[].class);
	}
	
	// recordSize : 1~1000, selector : PREVIOUS, NEXT
	public static Keyword[] listByAdgroupId(RestClient rest, int customerId, String adgroupId,int recordSize, String selector) throws Exception {
		HttpResponse<String> response =
				rest.get(keywordsPath, customerId)
				.queryString("nccAdgroupId", adgroupId)
				.queryString("recordSize", recordSize)
				.queryString("selector", selector)
				.asString();
		return rest.asObject(response, Keyword[].class);
	}
	
	public static Keyword[] listByAdgroupId(RestClient rest, int customerId, String adgroupId, String baseSearchId, int recordSize, String selector) throws Exception {
		HttpResponse<String> response =
				rest.get(keywordsPath, customerId)
				.queryString("nccAdgroupId", adgroupId)
				.queryString("baseSearchId", baseSearchId)
				.queryString("recordSize", recordSize)
				.queryString("selector", selector)
				.asString();
		return rest.asObject(response, Keyword[].class);
	}

	public static Keyword[] create(RestClient rest, int customerId, String adgroupId, Keyword[] keywords) throws Exception {
		HttpResponse<String> response =
				rest.post(keywordsPath, customerId)
						.queryString("nccAdgroupId", adgroupId)
						.body(keywords)
						.asString();
		return rest.asObject(response, Keyword[].class);
	}

	public static Keyword[] updateItems(RestClient rest, int customerId, Keyword[] keywords, String fields) throws Exception {
		HttpResponse<String> response =
				rest.put(keywordsPath, customerId)
						.queryString("fields", fields)
						.body(keywords)
						.asString();
		return rest.asObject(response, Keyword[].class);
	}

	public static Keyword updateItem(RestClient rest, int customerId, Keyword keyword, String fields) throws Exception {
		HttpResponse<String> response =
				rest.put(keywordsPath + "/" + keyword.getNccKeywordId(), customerId)
						.queryString("fields", fields)
						.body(keyword)
						.asString();
		return rest.asObject(response, Keyword.class);
	}

	public static Keyword delete(RestClient rest, int customerId, String ids) throws Exception {
		HttpResponse<String> response =
				rest.delete(keywordsPath, customerId)
						.queryString("ids", ids)
						.asString();
		return rest.asObject(response, Keyword.class);
	}


}
