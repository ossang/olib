package com.olib.app.admin.api.daumclix.service;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.springframework.stereotype.Service;

import com.olib.app.admin.api.daumclix.model.DaumParam;
import com.olib.app.admin.api.daumclix.request.DaumAdObjectRequest;
import com.olib.app.admin.api.daumclix.util.DaumApiUtil;

import net.daum.clix.api.adobject.impl.AdObjectServiceImplServiceStub;
import net.daum.clix.api.adobject.service.AdObjectTO;

@Service
public class DaumAdObjectService extends AbstractDaumService<AdObjectServiceImplServiceStub>{

	@Override
	public AdObjectServiceImplServiceStub getStub(DaumParam daumParam) {
		AdObjectServiceImplServiceStub stub;
		
		try {
			stub = new AdObjectServiceImplServiceStub();
			stub._getServiceClient().addHeader(DaumApiUtil.makeHeader(daumParam));
			stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(TIMEOUT);
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.REUSE_HTTP_CLIENT, new Boolean(true));
			
		} catch (AxisFault e) {
			e.printStackTrace();
			return null;
		}
		
		return stub;
	}
	
	public AdObjectTO getAdObject(
			String id, String password, 
			long siteId) throws RemoteException{
		
		AdObjectServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AdObjectTO result = DaumAdObjectRequest.getAdObject(stub, siteId);
		return execute(stub, result);
	}
	
	public AdObjectTO[] getAdObjects(
			String id, String password, 
			long accountId) throws RemoteException{
		
		AdObjectServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AdObjectTO[] result = DaumAdObjectRequest.getAdObjects(stub, accountId);
		return execute(stub, result);
	}
}
