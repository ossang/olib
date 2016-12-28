/**
 * AccountServiceImplServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.daum.clix.api.account.impl;


/**
 *  AccountServiceImplServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class AccountServiceImplServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public AccountServiceImplServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public AccountServiceImplServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getAccounts method
     * override this method for handling normal response from getAccounts operation
     */
    public void receiveResultgetAccounts(
        net.daum.clix.api.account.service.GetAccountsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAccounts operation
     */
    public void receiveErrorgetAccounts(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAccountBalance method
     * override this method for handling normal response from getAccountBalance operation
     */
    public void receiveResultgetAccountBalance(
        net.daum.clix.api.account.service.GetAccountBalanceResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAccountBalance operation
     */
    public void receiveErrorgetAccountBalance(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAccount method
     * override this method for handling normal response from getAccount operation
     */
    public void receiveResultgetAccount(
        net.daum.clix.api.account.service.GetAccountResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAccount operation
     */
    public void receiveErrorgetAccount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAccountsByPage method
     * override this method for handling normal response from getAccountsByPage operation
     */
    public void receiveResultgetAccountsByPage(
        net.daum.clix.api.account.service.GetAccountsByPageResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAccountsByPage operation
     */
    public void receiveErrorgetAccountsByPage(java.lang.Exception e) {
    }
}
