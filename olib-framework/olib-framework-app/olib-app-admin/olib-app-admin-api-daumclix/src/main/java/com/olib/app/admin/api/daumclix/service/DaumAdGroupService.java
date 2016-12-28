package com.olib.app.admin.api.daumclix.service;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.springframework.stereotype.Service;

import com.olib.app.admin.api.daumclix.model.DaumParam;
import com.olib.app.admin.api.daumclix.request.DaumAdGroupRequest;
import com.olib.app.admin.api.daumclix.util.DaumApiUtil;

import net.daum.clix.api.group.impl.AdGroupServiceImplServiceStub;
import net.daum.clix.api.group.service.AdGroupStatusTO;
import net.daum.clix.api.group.service.AdGroupTO;

@Service
public class DaumAdGroupService extends AbstractDaumService<AdGroupServiceImplServiceStub>{

	public AdGroupServiceImplServiceStub getStub(DaumParam daumParam){
		AdGroupServiceImplServiceStub stub;
		
		try {
			stub = new AdGroupServiceImplServiceStub();
			stub._getServiceClient().addHeader(DaumApiUtil.makeHeader(daumParam));
			stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(TIMEOUT);
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.REUSE_HTTP_CLIENT, new Boolean(true));
			
		} catch (AxisFault e) {
			e.printStackTrace();
			return null;
		}
		
		return stub;
	}
	
	public AdGroupTO[] getAdGroupByCampaignID(
			String id, String password, 
			long campaignId) throws RemoteException {
		
		AdGroupServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AdGroupTO[] result = DaumAdGroupRequest.getAdGroupByCampaignID(stub, campaignId);
		return execute(stub, result);
	}
	
	public AdGroupTO getAdGroup(
			String id, String password, 
			long adGroupId) throws RemoteException {
		
		AdGroupServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AdGroupTO result = DaumAdGroupRequest.getAdGroup(stub, adGroupId);
		return execute(stub, result);
	}
	
	public AdGroupStatusTO getStatusForAutobid(
			String id, String password, 
			long adGroupId) throws RemoteException {
		
		AdGroupServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AdGroupStatusTO result = DaumAdGroupRequest.getStatusForAutobid(stub, adGroupId);
		return execute(stub, result);
	}
	
}
