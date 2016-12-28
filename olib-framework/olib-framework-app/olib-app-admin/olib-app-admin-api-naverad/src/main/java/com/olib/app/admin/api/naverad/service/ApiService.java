package com.olib.app.admin.api.naverad.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.olib.app.admin.api.naverad.domain.ApiCode;
import com.olib.app.admin.api.naverad.domain.ApiPath;
import com.olib.app.admin.api.naverad.model.Ad;
import com.olib.app.admin.api.naverad.model.Adgroup;
import com.olib.app.admin.api.naverad.model.Bizmoney;
import com.olib.app.admin.api.naverad.model.BusinessChannel;
import com.olib.app.admin.api.naverad.model.Campaign;
import com.olib.app.admin.api.naverad.model.CustomerLink;
import com.olib.app.admin.api.naverad.model.Keyword;
import com.olib.app.admin.api.naverad.model.ManagedKeyword;
import com.olib.app.admin.api.naverad.model.estimate.Bid;
import com.olib.app.admin.api.naverad.model.estimate.IDType;
import com.olib.app.admin.api.naverad.model.estimate.RequestAveragePositionBid;
import com.olib.app.admin.api.naverad.model.estimate.RequestExposureMinimumBid;
import com.olib.app.admin.api.naverad.model.estimate.RequestMedianBid;
import com.olib.app.admin.api.naverad.model.estimate.RequestPerformance;
import com.olib.app.admin.api.naverad.model.estimate.RequestPerformanceBulk;
import com.olib.app.admin.api.naverad.model.estimate.ResponseAveragePositionBid;
import com.olib.app.admin.api.naverad.model.estimate.ResponsePerformance;
import com.olib.app.admin.api.naverad.model.estimate.ResponsePerformanceBulk;
import com.olib.app.admin.api.naverad.request.Adgroups;
import com.olib.app.admin.api.naverad.request.Ads;
import com.olib.app.admin.api.naverad.request.Bizmoneys;
import com.olib.app.admin.api.naverad.request.BusinessChannels;
import com.olib.app.admin.api.naverad.request.Campaigns;
import com.olib.app.admin.api.naverad.request.CustomerLinks;
import com.olib.app.admin.api.naverad.request.Estimate;
import com.olib.app.admin.api.naverad.request.Keywords;
import com.olib.app.admin.api.naverad.util.RestClient;

@Service
public class ApiService {

//------------------------------------------------------------------------------
// 키워드 리스트 조회	
//------------------------------------------------------------------------------	
	public Keyword[] getKeywordList(
			String apiKey,
			String secretKey,
			int customerId,
			String adgroupId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Keywords.listByAdgroupId(rest, customerId, adgroupId);
	}
	
	public Keyword[] getKeywordList(
			String apiKey,
			String secretKey,
			int customerId,
			String adgroupId,
			int recordSize,
			String selector) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Keywords.listByAdgroupId(rest, customerId, adgroupId,recordSize,selector);
	}
	public Keyword[] getKeywordList(
			String apiKey,
			String secretKey,
			int customerId,
			String adgroupId,
			String baseSearchId,
			int recordSize,
			String selector) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Keywords.listByAdgroupId(rest, customerId, adgroupId,baseSearchId,recordSize,selector);
	}
//------------------------------------------------------------------------------
// 그룹 리스트 조회	
//------------------------------------------------------------------------------	
	public Adgroup getGroup(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String adgroupId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Adgroups.get(rest, customerId, adgroupId);
	}
	
	
	public Adgroup[] getGroupList(
			String apiKey,
			String secretKey,
			int customerId, 
			String campaignId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Adgroups.listByCampaignId(rest, customerId, campaignId);
	}
	
	
//------------------------------------------------------------------------------
// 캠페인 리스트 조회	
//------------------------------------------------------------------------------
	public Campaign getCampaign(
			String apiKey, 
			String secretKey, 
			int customerId,
			String campaignId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Campaigns.getCampaign(rest, customerId, campaignId);
	}
	
	public Campaign[] getCampaignList(
			String apiKey,
			String secretKey, 
			int customerId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Campaigns.list(rest, customerId);
	}
	
//------------------------------------------------------------------------------
// 매니저 및 클라이언트 조회
// type : MYMANAGERS , MYCLIENTS	
//------------------------------------------------------------------------------	
	public CustomerLink[] getManagedCustomerList(
			String apiKey, 
			String secretKey, 
			int customerId,
			String type) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return CustomerLinks.list(rest, customerId, type);
	}
	
//------------------------------------------------------------------------------
// CPC 업데이트
//------------------------------------------------------------------------------	
	public Keyword updateKeywordAdBid(
			String apiKey, 
			String secretKey, 
			int customerId,
			String nccAdgroupId, 
			String nccKeywordId, 
			boolean useGroupBidAmt,
			Integer bid) throws Exception{
		
		Keyword keyword = new Keyword();
		keyword.setUseGroupBidAmt(useGroupBidAmt);
		keyword.setNccAdgroupId(nccAdgroupId);
		keyword.setNccKeywordId(nccKeywordId);
		keyword.setBidAmt(bid);
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		Keyword keywords = Keywords.updateItem(rest, customerId, keyword , ApiCode.ADKEYWORD_BIDAMT);
		return keywords;
	}
	
	
//------------------------------------------------------------------------------	
// 키워드 상태 업데이트 userLock : false(광고사용), true(광고사용중지)
//------------------------------------------------------------------------------	
	public Keyword updateKeywordAdStatus(
			String apiKey, 
			String secretKey,
			int customerId,
			String nccAdgroupId,
			String nccKeywordId,
			boolean userLock) throws Exception{
		
		Keyword keyword = new Keyword();
		keyword.setNccAdgroupId(nccAdgroupId);
		keyword.setNccKeywordId(nccKeywordId);
		keyword.setUserLock(userLock);
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Keywords.updateItem(rest, customerId, keyword , ApiCode.ADKEYWORD_USERLOCK);
	}
//------------------------------------------------------------------------------	
// 키워드 상태 조회
//------------------------------------------------------------------------------	
	public String getKeyweordAdStatus(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String keywordId) throws Exception{
		
		Keyword keywords = getKeyweordAd(apiKey, secretKey, customerId, keywordId);
		return keywords.getStatus();
	}
	
	public Keyword getKeyweordAd(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String keywordId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		Keyword keywords = Keywords.getKeyword(rest, customerId, keywordId);
		return keywords;
	}
	
	public String getKeyweordAdStatusReason(
			String apiKey, 
			String secretKey,
			int customerId,
			String keywordId) throws Exception{
		
		Keyword keywords = getKeyweordAd(apiKey, secretKey, customerId, keywordId);
		return keywords.getStatusReason();
	}
	
//------------------------------------------------------------------------------
// 키워드 CPC 조회
//------------------------------------------------------------------------------
	public Integer getKeywordAdCPC(
			String apiKey,
			String secretKey,
			int customerId, 
			String keywordId) throws Exception{
		
		Keyword keywords = getKeyweordAd(apiKey, secretKey, customerId, keywordId);
		return keywords.getBidAmt();
	}
	

//------------------------------------------------------------------------------	
// 성인키워드 여부 조회 ( 1: yes, 0: no )
//------------------------------------------------------------------------------	
	public ManagedKeyword getKeywordManaged(
			String apiKey, 
			String secretKey,
			int customerId,
			String keywordId) throws Exception{
		
		Keyword keywords = getKeyweordAd(apiKey, secretKey, customerId, keywordId);
		return keywords.getManagedKeyword();
	}
	
	public Boolean isAdultKeyword(
			String apiKey, 
			String secretKey,
			int customerId,
			String keywordId) throws Exception{
		
		ManagedKeyword keywordManaged = getKeywordManaged(apiKey, secretKey, customerId, keywordId);
		if(keywordManaged == null) return null;
		return keywordManaged.isAdult();
	}
	
//------------------------------------------------------------------------------
// 클라이언트 조회	
//------------------------------------------------------------------------------
	public CustomerLink[] getCustomerLink(
			String apiKey, 
			String secretKey,
			int customerId,
			String type) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return CustomerLinks.list(rest, customerId, type);
	}
	
	public List<Integer> getCustomerIdList(
			String apiKey, 
			String secretKey,
			int customerId	) throws Exception{
		
		return Arrays.asList(getCustomerLink(apiKey, secretKey, customerId,ApiCode.CUSTOMERLINK_TYPE_CLIENT))
				.stream()
				.map(CustomerLink::getClientCustomerId)
				.collect(Collectors.toList());
	}
//------------------------------------------------------------------------------
// 소재 조회	
//------------------------------------------------------------------------------	
	public Ad[] getAdList(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String adgroupId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		Ad[] ads = Ads.listByAdgroupId(rest, adgroupId, customerId);
		return ads;
	}
	
	public Ad getAd(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String adId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		Ad ad = Ads.get(rest, adId, customerId);
		return ad;
	}
	
	public Ad updateAd(
			String apiKey, 
			String secretKey,
			int customerId,
			String adId,
			String fields, 
			String bidAmt, 
			boolean useGroupBidAmt) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		Ad ad = new Ad();
		Map<String, Object> adAttr = new HashMap<>();
		adAttr.put("bidAmt", bidAmt);
		adAttr.put("useGroupBidAmt", useGroupBidAmt);
		ad.setAdAttr(adAttr );
		
		Ad response = Ads.update(rest, adId, fields, ad , customerId);
		return response;
	}
	
//------------------------------------------------------------------------------
// 	광고주 잔액조회
//------------------------------------------------------------------------------
	public int getBizmoney(
			String apiKey, 
			String secretKey, 
			int customerId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Bizmoneys.get(rest, customerId).getBizmoney();
	}
	
	public boolean isBudgetLock(
			String apiKey, 
			String secretKey, 
			int customerId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Bizmoneys.get(rest, customerId).isBudgetLock();
	}
	
	public Bizmoney getBiz(
			String apiKey, 
			String secretKey, 
			int customerId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Bizmoneys.get(rest, customerId);
	}
	
//------------------------------------------------------------------------------
// 비즈채널 조회	
//------------------------------------------------------------------------------
	public BusinessChannel getBusinessChannel(
			String apiKey, 
			String secretKey, 
			int customerId, 
			String businessChannelId) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return BusinessChannels.get(rest, customerId, businessChannelId);
	}
	
//------------------------------------------------------------------------------
// 	Estimate
//------------------------------------------------------------------------------	
	public ResponseAveragePositionBid getAveragePositionBid(
			String apiKey, 
			String secretKey, 
			int customerId, 
			IDType type, 
			RequestAveragePositionBid req) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Estimate.getAveragePositionBid(rest, customerId, type, req);
	}
	
	public Bid[] getMedianBid(
			String apiKey, 
			String secretKey, 
			int customerId, 
			IDType type, 
			RequestMedianBid req) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Estimate.getMedianBid(rest, customerId, type, req);
		
	}
	
	public Bid[] getExposureMiniMumBid(
			String apiKey, 
			String secretKey, 
			int customerId, 
			IDType type, 
			RequestExposureMinimumBid req) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Estimate.getExposureMinimumBid(rest, customerId, type, req);
	}
	
	public ResponsePerformance getPerformance(
			String apiKey, 
			String secretKey, 
			int customerId, 
			IDType type,
			RequestPerformance req) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Estimate.getPerformance(rest, customerId, type, req);
		
	}
	
	public ResponsePerformanceBulk getPerformanceBulk(
			String apiKey, 
			String secretKey, 
			int customerId, 
			RequestPerformanceBulk req) throws Exception{
		
		RestClient rest = RestClient.of(ApiPath.API_SERVER_HOST, apiKey, secretKey);
		return Estimate.getPerformanceBulk(rest, customerId, req);
	}
	
}
