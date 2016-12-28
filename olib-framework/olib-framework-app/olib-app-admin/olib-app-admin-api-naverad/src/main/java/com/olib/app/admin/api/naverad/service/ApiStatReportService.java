package com.olib.app.admin.api.naverad.service;

import java.io.InputStream;
import java.net.URI;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.olib.app.admin.api.naverad.domain.ApiPath;
import com.olib.app.admin.api.naverad.model.StatReport;
import com.olib.app.admin.api.naverad.request.StatReports;
import com.olib.app.admin.api.naverad.util.RestClient;

@Service
public class ApiStatReportService {

	public StatReport[] list(String apiKey, String secretKey, int customerId) throws Exception{
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return StatReports.list(rest, customerId);
	}
	
	public StatReport get(String apiKey, String secretKey, int customerId, long reportJobId) throws Exception{
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return StatReports.get(rest, customerId, reportJobId);
	}
	
	public StatReport create(String apiKey, String secretKey, int customerId, String reportType, String statDate) throws Exception{
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return StatReports.create(rest, customerId, reportType, statDate);
	}
	
	public boolean delete(String apiKey, String secretKey, int customerId, String reportJobId) throws Exception{
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		StatReports.delete(rest, customerId, reportJobId);
		return true;
	}
	
	//------------------------------------------------------------------------------
	// 리포트 상태 체크 ( REGIST, RUNNING, BUILT, NONE, ERROR ) 
	//------------------------------------------------------------------------------
	public String getStatReportStatus(String apiKey, String secretKey, int customerId, long reportId) {
		try {
			RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
			StatReport getStatjob;
			getStatjob = StatReports.get(rest, customerId, reportId);
			if(getStatjob == null) return null;
			return getStatjob.getStatus().toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//------------------------------------------------------------------------------
	// 리포트 다운로드 url 반환 
	//------------------------------------------------------------------------------
	public String getStatReportDownload(
			String apiKey,
			String secretKey,
			int customerId, 
			long reportId) {
		
		try{
			RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
			StatReport getStatjob = StatReports.get(rest, customerId, reportId);
			return getStatjob.getDownloadUrl();
		} catch (Exception e){
			return null;
		}
	}
	
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
