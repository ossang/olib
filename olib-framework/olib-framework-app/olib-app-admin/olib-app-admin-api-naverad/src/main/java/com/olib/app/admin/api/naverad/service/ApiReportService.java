package com.olib.app.admin.api.naverad.service;

import java.io.InputStream;
import java.net.URI;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.domain.ApiPath;
import com.olib.app.admin.api.naverad.model.MasterReport;
import com.olib.app.admin.api.naverad.model.MasterReport.Item;
import com.olib.app.admin.api.naverad.request.Adgroups;
import com.olib.app.admin.api.naverad.request.Campaigns;
import com.olib.app.admin.api.naverad.request.Keywords;
import com.olib.app.admin.api.naverad.request.MasterReports;
import com.olib.app.admin.api.naverad.util.RestClient;

@Service
public class ApiReportService {
	
//------------------------------------------------------------------------------	
// 리포트 요청
//------------------------------------------------------------------------------	
	public String createReport(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String item) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		Thread.sleep(1000);
		MasterReport fullReport = MasterReports.createFullMasterReportJob(rest, customerId, Item.valueOf(item));
		
		if(fullReport != null)	return fullReport.getId();
		return null;
	}
	
//------------------------------------------------------------------------------
// 리포트 상태 체크 ( REGIST, RUNNING, BUILT, NONE, ERROR ) 
//------------------------------------------------------------------------------	
	public String getReportStatus(String apiKey, String secretKey, int customerId, String reportId) {
		try {
			RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
			MasterReport getjob;
			getjob = MasterReports.getMasterReportJob(rest, customerId, reportId);
			if(getjob == null) return null;
			return getjob.getStatus().toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
//------------------------------------------------------------------------------
// 리포트 다운로드 url 반환 
//------------------------------------------------------------------------------	
	public String getReportDownload(
			String apiKey,
			String secretKey,
			int customerId, 
			String reportId) {
		
		try{
			RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
			MasterReport getjob = MasterReports.getMasterReportJob(rest, customerId, reportId);
			return getjob.getDownloadUrl();
		} catch (Exception e){
			return null;
		}
	}

//------------------------------------------------------------------------------	
// 리포트 리스트 요청
//------------------------------------------------------------------------------	
	public MasterReport[] getReportList(
			String apiKey, 
			String secretKey, 
			int customerId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		MasterReport[] reportList = MasterReports.getListOfMasterReportJobs(rest, customerId);
		if(reportList != null)	return reportList;
		return null;
	}
	
//------------------------------------------------------------------------------	
// 마스터 리포트 리스트 전체 삭제
//------------------------------------------------------------------------------	
	public String deleteAll(
			String apiKey, 
			String secretKey, 
			int customerId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		String result = MasterReports.deleteAllMasterReportJobs(rest, customerId);
		if(result != null)	return result;
		return null;
	}
//------------------------------------------------------------------------------
// 키워드명 조회	
//------------------------------------------------------------------------------
	public String getKeyweordName(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String keywordId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Keywords.getKeyword(rest, customerId, keywordId).getKeyword();
	}
//------------------------------------------------------------------------------
// 그룹명 조회	
//------------------------------------------------------------------------------
	public String getGroupName(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String adgroupId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Adgroups.get(rest, customerId, adgroupId).getName();
	}
//------------------------------------------------------------------------------
// 캠페인명 조회	
//------------------------------------------------------------------------------
	public String getCampaignName(
			String apiKey, 
			String secretKey, 
			int customerId,
			String campaignId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Campaigns.getCampaign(rest, customerId, campaignId).getName();
	}
	
//------------------------------------------------------------------------------	
// 리포트 다운로드
// downloadUrl : 리포트 다운로드 주소
//------------------------------------------------------------------------------	
	public HttpResponse<InputStream> getDownloadReportResponse(
			String apiKey, 
			String secretKey,
			int customerId, 
			String downloadUrl) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		List<NameValuePair> params = URLEncodedUtils.parse(new URI(downloadUrl), "UTF-8");
		if (!params.isEmpty()) {
			NameValuePair value = params.get(0);
			if ("authtoken".equals(value.getName())) {
				String authtoken = value.getValue();
				HttpResponse<InputStream> response = rest.get("/report-download", customerId)
						.queryString("authtoken", authtoken)
						.asBinary();
				
				return response;
			}
		}
		return null;
	}
}
