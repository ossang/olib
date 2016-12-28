package com.olib.app.admin.api.daumclix.request;

import java.rmi.RemoteException;

import net.daum.clix.api.ad.impl.AdServiceImplServiceStub;
import net.daum.clix.api.ad.service.AdResponse;
import net.daum.clix.api.ad.service.AdStatus;
import net.daum.clix.api.ad.service.AdTO;
import net.daum.clix.api.ad.service.GetAd;
import net.daum.clix.api.ad.service.GetAdE;
import net.daum.clix.api.ad.service.GetAdsByAdGroupID;
import net.daum.clix.api.ad.service.GetAdsByAdGroupIDE;
import net.daum.clix.api.ad.service.UpdateMaxBidForAds;
import net.daum.clix.api.ad.service.UpdateMaxBidForAdsE;
import net.daum.clix.api.ad.service.UpdateStatusForAds;
import net.daum.clix.api.ad.service.UpdateStatusForAdsE;

public class DaumAdRequest {

	public static AdTO getAd(
			AdServiceImplServiceStub stub,
			long keywordId) throws RemoteException {
		
		GetAdE getAd = new GetAdE();
		GetAd param = new GetAd();
		param.setArg0(keywordId);
		getAd.setGetAd(param);
		
		return stub.getAd(getAd)
				.getGetAdResponse()
				.get_return();
	}
	
	public static AdTO[] getAdsByGroupID(
			AdServiceImplServiceStub stub,
			long adGroupId) throws RemoteException{
		
		GetAdsByAdGroupIDE getAdsByAdGroupID = new GetAdsByAdGroupIDE();
		GetAdsByAdGroupID param = new GetAdsByAdGroupID();
		param.setArg0(adGroupId);
		getAdsByAdGroupID.setGetAdsByAdGroupID(param );
		
		return stub.getAdsByAdGroupID(getAdsByAdGroupID)
				.getGetAdsByAdGroupIDResponse()
				.get_return();
		
	}
	
	public static AdResponse[] updateMaxBidForAds(
			AdServiceImplServiceStub stub,
			AdTO adTo) throws RemoteException{
		
		UpdateMaxBidForAdsE updateMaxBidForAds = new UpdateMaxBidForAdsE();
		UpdateMaxBidForAds param = new UpdateMaxBidForAds();
		AdTO[] adToArr = new AdTO[1];
		adToArr[0] = adTo;
		param.setArg0(adToArr);
		updateMaxBidForAds.setUpdateMaxBidForAds(param);
		
		return stub.updateMaxBidForAds(updateMaxBidForAds)
				.getUpdateMaxBidForAdsResponse()
				.get_return();
			
	}
	
	public static AdResponse[] updateStatusForAds(
			AdServiceImplServiceStub stub,
			long adId, 
			AdStatus status) throws RemoteException{
		
		UpdateStatusForAdsE updateStatusForAds = new UpdateStatusForAdsE();
		UpdateStatusForAds param = new UpdateStatusForAds();
		long[] adIds = new long[1];
		adIds[0] = adId;
		param.setArg0(adIds);
		param.setArg1(status);
		updateStatusForAds.setUpdateStatusForAds(param);
		
		return stub.updateStatusForAds(updateStatusForAds )
				.getUpdateStatusForAdsResponse()
				.get_return();
	}
	
}
