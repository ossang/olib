package com.olib.app.admin.api.daumclix.request;

import java.rmi.RemoteException;

import net.daum.clix.api.campaign.impl.CampaignServiceImplServiceStub;
import net.daum.clix.api.campaign.service.CampaignTO;
import net.daum.clix.api.campaign.service.GetCampaign;
import net.daum.clix.api.campaign.service.GetCampaignE;
import net.daum.clix.api.campaign.service.GetCampaignsByAccountID;
import net.daum.clix.api.campaign.service.GetCampaignsByAccountIDE;

public class DaumCampaignRequest {

	public static CampaignTO[] getCampaignsByAccountId(
			CampaignServiceImplServiceStub stub,
			long accountId ) throws RemoteException {
		
		GetCampaignsByAccountIDE getCampaignsByAccountID = new GetCampaignsByAccountIDE();
		GetCampaignsByAccountID param = new GetCampaignsByAccountID();
		param.setArg0(accountId);
		getCampaignsByAccountID.setGetCampaignsByAccountID(param );
		
		return stub.getCampaignsByAccountID(getCampaignsByAccountID)
				.getGetCampaignsByAccountIDResponse()
				.get_return();
	}
	
	public static CampaignTO getCampaign(
			CampaignServiceImplServiceStub stub,
			long campaignId) throws RemoteException {
		
		GetCampaignE getCampaign = new GetCampaignE();
		GetCampaign param = new GetCampaign();
		param.setArg0(campaignId);
		getCampaign.setGetCampaign(param);
		
		return stub.getCampaign(getCampaign)
				.getGetCampaignResponse()
				.get_return();
	}
}
