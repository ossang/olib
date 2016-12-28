package com.olib.app.admin.api.daumclix.request;

import java.rmi.RemoteException;

import net.daum.clix.api.group.impl.AdGroupServiceImplServiceStub;
import net.daum.clix.api.group.service.AdGroupStatusTO;
import net.daum.clix.api.group.service.AdGroupTO;
import net.daum.clix.api.group.service.GetAdGroup;
import net.daum.clix.api.group.service.GetAdGroupByCampaignID;
import net.daum.clix.api.group.service.GetAdGroupByCampaignIDE;
import net.daum.clix.api.group.service.GetAdGroupE;
import net.daum.clix.api.group.service.GetStatusForAutobid;
import net.daum.clix.api.group.service.GetStatusForAutobidE;

public class DaumAdGroupRequest {

	public static AdGroupTO[] getAdGroupByCampaignID(
		AdGroupServiceImplServiceStub stub,
		long campaignId) throws RemoteException {
	
		GetAdGroupByCampaignIDE getAdGroupByCampaignID = new GetAdGroupByCampaignIDE();
		GetAdGroupByCampaignID param = new GetAdGroupByCampaignID();
		param.setArg0(campaignId);
		getAdGroupByCampaignID.setGetAdGroupByCampaignID(param );
		
		return stub.getAdGroupByCampaignID(getAdGroupByCampaignID)
				.getGetAdGroupByCampaignIDResponse()
				.get_return();
	}
	
	public static AdGroupTO getAdGroup(
			AdGroupServiceImplServiceStub stub,
			long adGroupId) throws RemoteException {
		
		GetAdGroupE getAdGroup = new GetAdGroupE();
		GetAdGroup param = new GetAdGroup();
		param.setArg0(adGroupId);
		getAdGroup.setGetAdGroup(param );
		
		return stub.getAdGroup(getAdGroup)
				.getGetAdGroupResponse()
				.get_return();
			
	}
	
	public static AdGroupStatusTO getStatusForAutobid(
			AdGroupServiceImplServiceStub stub,
			long adGroupId) throws RemoteException {
		
		GetStatusForAutobidE getStatusForAutobid = new GetStatusForAutobidE();
		GetStatusForAutobid param = new GetStatusForAutobid();
		param.setArg0(adGroupId);
		getStatusForAutobid.setGetStatusForAutobid(param);
		
		return stub.getStatusForAutobid(getStatusForAutobid)
				.getGetStatusForAutobidResponse()
				.get_return();
	}
	
}
