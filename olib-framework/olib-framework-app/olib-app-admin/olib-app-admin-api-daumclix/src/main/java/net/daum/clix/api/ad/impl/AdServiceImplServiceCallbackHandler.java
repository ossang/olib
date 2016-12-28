/**
 * AdServiceImplServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.daum.clix.api.ad.impl;


/**
 *  AdServiceImplServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class AdServiceImplServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public AdServiceImplServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public AdServiceImplServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for updateMaxBidForAds method
     * override this method for handling normal response from updateMaxBidForAds operation
     */
    public void receiveResultupdateMaxBidForAds(
        net.daum.clix.api.ad.service.UpdateMaxBidForAdsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateMaxBidForAds operation
     */
    public void receiveErrorupdateMaxBidForAds(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getStatusForAd method
     * override this method for handling normal response from getStatusForAd operation
     */
    public void receiveResultgetStatusForAd(
        net.daum.clix.api.ad.service.GetStatusForAdResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getStatusForAd operation
     */
    public void receiveErrorgetStatusForAd(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAd method
     * override this method for handling normal response from getAd operation
     */
    public void receiveResultgetAd(
        net.daum.clix.api.ad.service.GetAdResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAd operation
     */
    public void receiveErrorgetAd(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAdsByAdGroupID method
     * override this method for handling normal response from getAdsByAdGroupID operation
     */
    public void receiveResultgetAdsByAdGroupID(
        net.daum.clix.api.ad.service.GetAdsByAdGroupIDResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAdsByAdGroupID operation
     */
    public void receiveErrorgetAdsByAdGroupID(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateStatusForAds method
     * override this method for handling normal response from updateStatusForAds operation
     */
    public void receiveResultupdateStatusForAds(
        net.daum.clix.api.ad.service.UpdateStatusForAdsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateStatusForAds operation
     */
    public void receiveErrorupdateStatusForAds(java.lang.Exception e) {
    }
}
