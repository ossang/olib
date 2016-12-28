package com.olib.app.admin.api.daumclix.service;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.springframework.stereotype.Service;

import com.olib.app.admin.api.daumclix.model.DaumParam;
import com.olib.app.admin.api.daumclix.request.DaumAdRequest;
import com.olib.app.admin.api.daumclix.util.DaumApiUtil;

import net.daum.clix.api.ad.impl.AdServiceImplServiceStub;
import net.daum.clix.api.ad.service.AdResponse;
import net.daum.clix.api.ad.service.AdStatus;
import net.daum.clix.api.ad.service.AdTO;

@Service
public class DaumAdService extends AbstractDaumService<AdServiceImplServiceStub>{

	public AdServiceImplServiceStub getStub(DaumParam daumParam){
		AdServiceImplServiceStub stub;
		
		try {
			stub = new AdServiceImplServiceStub();
			stub._getServiceClient().addHeader(DaumApiUtil.makeHeader(daumParam));
			stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(TIMEOUT);
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.REUSE_HTTP_CLIENT, new Boolean(true));
			
		} catch (AxisFault e) {
			e.printStackTrace();
			return null;
		}
		
		return stub;
	}
	
	public AdTO getAd(
			String id, String password,
			long keywordId) throws RemoteException  {
		
		AdServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AdTO result = DaumAdRequest.getAd(stub, keywordId);
		return execute(stub, result);
	}
	
	public AdTO[] getAdsByGroupID(
			String id, String password,
			long adGroupId) throws RemoteException{
		
		AdServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AdTO[] result = DaumAdRequest.getAdsByGroupID(stub, adGroupId);
		return execute(stub, result);
	}
	
	public AdResponse[] updateMaxBidForAds(
			String id, String password, 
			AdTO adTo) throws RemoteException{
		
		AdServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AdResponse[] result = DaumAdRequest.updateMaxBidForAds(stub, adTo);
		return execute(stub, result);
	}
	
	public AdResponse[] updateStatusForAds(
			String id, String password, 
			long adId, 
			AdStatus status) throws RemoteException{
		
		AdServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AdResponse[] result = DaumAdRequest.updateStatusForAds(stub, adId, status);
		return execute(stub, result);
	}
}
