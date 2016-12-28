package com.olib.app.admin.api.daumclix.service;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.springframework.stereotype.Service;

import com.olib.app.admin.api.daumclix.model.DaumParam;
import com.olib.app.admin.api.daumclix.request.DaumCampaignRequest;
import com.olib.app.admin.api.daumclix.util.DaumApiUtil;

import net.daum.clix.api.campaign.impl.CampaignServiceImplServiceStub;
import net.daum.clix.api.campaign.service.CampaignTO;

@Service
public class DaumCampaignService extends AbstractDaumService<CampaignServiceImplServiceStub>{
	
	public CampaignServiceImplServiceStub getStub(DaumParam daumParam){
		CampaignServiceImplServiceStub stub;
		
		try {
			stub = new CampaignServiceImplServiceStub();
			stub._getServiceClient().addHeader(DaumApiUtil.makeHeader(daumParam));
			stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(TIMEOUT);
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.REUSE_HTTP_CLIENT, new Boolean(true));
			
		} catch (AxisFault e) {
			e.printStackTrace();
			return null;
		}
		
		return stub;
	}
	
	public CampaignTO[] getCampaignsByAccountId(
			String id, String password,
			long accountId) throws RemoteException {
		
		CampaignServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		CampaignTO[] result = DaumCampaignRequest.getCampaignsByAccountId(stub, accountId);
		return execute(stub, result);
	}
	
	public CampaignTO getCampaign(
			String id, String password,
			long campaignId) throws RemoteException {
		
		CampaignServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		CampaignTO result = DaumCampaignRequest.getCampaign(stub, campaignId);
		return execute(stub, result);
	}
}
