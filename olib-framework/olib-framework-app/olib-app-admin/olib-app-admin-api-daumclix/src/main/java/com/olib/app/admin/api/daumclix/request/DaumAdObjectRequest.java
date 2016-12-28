package com.olib.app.admin.api.daumclix.request;

import java.rmi.RemoteException;

import net.daum.clix.api.adobject.impl.AdObjectServiceImplServiceStub;
import net.daum.clix.api.adobject.service.AdObjectTO;
import net.daum.clix.api.adobject.service.GetAdObject;
import net.daum.clix.api.adobject.service.GetAdObjectE;
import net.daum.clix.api.adobject.service.GetAdObjects;
import net.daum.clix.api.adobject.service.GetAdObjectsE;

public class DaumAdObjectRequest {

	public static AdObjectTO getAdObject(
			AdObjectServiceImplServiceStub stub, 
			long siteId) throws RemoteException{
		
		GetAdObjectE getAdObject = new GetAdObjectE();
		GetAdObject param = new GetAdObject();
		param.setArg0(siteId);
		getAdObject.setGetAdObject(param );
		
		return stub.getAdObject(getAdObject)
				.getGetAdObjectResponse()
				.get_return();
	}
	
	public static AdObjectTO[] getAdObjects(
			AdObjectServiceImplServiceStub stub, 
			long accountId) throws RemoteException{
		
		GetAdObjectsE getAdObjects = new GetAdObjectsE();
		GetAdObjects param = new GetAdObjects();
		param.setArg0(accountId);
		getAdObjects.setGetAdObjects(param );
		
		return stub.getAdObjects(getAdObjects)
				.getGetAdObjectsResponse()
				.get_return();
	}
	
}
