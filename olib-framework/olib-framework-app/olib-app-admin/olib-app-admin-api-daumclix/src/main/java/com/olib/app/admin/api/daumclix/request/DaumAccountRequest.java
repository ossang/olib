package com.olib.app.admin.api.daumclix.request;

import java.rmi.RemoteException;

import net.daum.clix.api.account.impl.AccountServiceImplServiceStub;
import net.daum.clix.api.account.service.AccountBalanceTO;
import net.daum.clix.api.account.service.AccountTO;
import net.daum.clix.api.account.service.GetAccount;
import net.daum.clix.api.account.service.GetAccountBalance;
import net.daum.clix.api.account.service.GetAccountBalanceE;
import net.daum.clix.api.account.service.GetAccountE;
import net.daum.clix.api.account.service.GetAccounts;
import net.daum.clix.api.account.service.GetAccountsE;

public class DaumAccountRequest {
	
	public static AccountBalanceTO getAccountBalance(
			AccountServiceImplServiceStub stub, 
			long accountId) throws RemoteException{
		
		GetAccountBalanceE getAccountBalance = new GetAccountBalanceE();
		GetAccountBalance param = new GetAccountBalance();
		param.setArg0(accountId);
		getAccountBalance.setGetAccountBalance(param );
		
		return stub.getAccountBalance(getAccountBalance )
				.getGetAccountBalanceResponse()
				.get_return();
	}
	
	public static AccountTO[] getAccounts(
			AccountServiceImplServiceStub stub) throws RemoteException {
		
		GetAccountsE getAccounts = new GetAccountsE();
		getAccounts.setGetAccounts(new GetAccounts());
		
		return stub.getAccounts(getAccounts)
					.getGetAccountsResponse()
					.get_return();
	}
	
	public static AccountTO getAccount(
			AccountServiceImplServiceStub stub,
			long accountId) throws RemoteException {
		
		GetAccountE getAccount = new GetAccountE();
		GetAccount param = new GetAccount();
		param.setArg0(accountId);
		getAccount.setGetAccount(param);
				
		return stub.getAccount(getAccount)
					.getGetAccountResponse()
					.get_return();
	}
}
