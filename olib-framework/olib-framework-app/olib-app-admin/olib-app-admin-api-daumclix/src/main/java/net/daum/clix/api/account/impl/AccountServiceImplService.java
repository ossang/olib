/**
 * AccountServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.daum.clix.api.account.impl;


/*
 *  AccountServiceImplService java interface
 */
public interface AccountServiceImplService {
    /**
     * Auto generated method signature
     *
     * @param getAccounts0
     */
    public net.daum.clix.api.account.service.GetAccountsResponseE getAccounts(
        net.daum.clix.api.account.service.GetAccountsE getAccounts0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAccounts0
     */
    public void startgetAccounts(
        net.daum.clix.api.account.service.GetAccountsE getAccounts0,
        final net.daum.clix.api.account.impl.AccountServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAccountBalance2
     */
    public net.daum.clix.api.account.service.GetAccountBalanceResponseE getAccountBalance(
        net.daum.clix.api.account.service.GetAccountBalanceE getAccountBalance2)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAccountBalance2
     */
    public void startgetAccountBalance(
        net.daum.clix.api.account.service.GetAccountBalanceE getAccountBalance2,
        final net.daum.clix.api.account.impl.AccountServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAccount4
     */
    public net.daum.clix.api.account.service.GetAccountResponseE getAccount(
        net.daum.clix.api.account.service.GetAccountE getAccount4)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAccount4
     */
    public void startgetAccount(
        net.daum.clix.api.account.service.GetAccountE getAccount4,
        final net.daum.clix.api.account.impl.AccountServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAccountsByPage6
     */
    public net.daum.clix.api.account.service.GetAccountsByPageResponseE getAccountsByPage(
        net.daum.clix.api.account.service.GetAccountsByPageE getAccountsByPage6)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAccountsByPage6
     */
    public void startgetAccountsByPage(
        net.daum.clix.api.account.service.GetAccountsByPageE getAccountsByPage6,
        final net.daum.clix.api.account.impl.AccountServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
