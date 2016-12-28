package com.olib.app.admin.api.daumclix.service;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.springframework.stereotype.Service;

import com.olib.app.admin.api.daumclix.model.DaumParam;
import com.olib.app.admin.api.daumclix.request.DaumAccountRequest;
import com.olib.app.admin.api.daumclix.util.DaumApiUtil;

import net.daum.clix.api.account.impl.AccountServiceImplServiceStub;
import net.daum.clix.api.account.service.AccountBalanceTO;
import net.daum.clix.api.account.service.AccountTO;

@Service
public class DaumAccountService extends AbstractDaumService<AccountServiceImplServiceStub>{

	public AccountServiceImplServiceStub getStub(DaumParam daumParam){
		AccountServiceImplServiceStub stub;
		
		try {
			stub = new AccountServiceImplServiceStub();
			stub._getServiceClient().addHeader(DaumApiUtil.makeHeader(daumParam));
			stub._getServiceClient().getOptions().setTimeOutInMilliSeconds(TIMEOUT);
			stub._getServiceClient().getOptions().setProperty(HTTPConstants.REUSE_HTTP_CLIENT, new Boolean(true));
			
		} catch (AxisFault e) {
			e.printStackTrace();
			return null;
		}
		
		return stub;
	}
	
	public AccountBalanceTO getAccountBalance(
			String id, String password,
			long accountId) throws RemoteException{
		
		AccountServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AccountBalanceTO result = DaumAccountRequest.getAccountBalance(stub, accountId);
		return execute(stub, result);
	}
	
	public AccountTO[] getAccounts(
			String id, String password) throws RemoteException {
		
		AccountServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AccountTO[] result = DaumAccountRequest.getAccounts(stub);
		return execute(stub, result);
	}
	
	public AccountTO getAccount(
			String id, String password, 
			long accountId) throws RemoteException{
		
		AccountServiceImplServiceStub stub = getStub(new DaumParam(id,password));
		AccountTO result = DaumAccountRequest.getAccount(stub,accountId);
		return execute(stub, result);
	}
}
