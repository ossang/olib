/**
 * AdGroupServiceImplServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.daum.clix.api.group.impl;


/**
 *  AdGroupServiceImplServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class AdGroupServiceImplServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public AdGroupServiceImplServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public AdGroupServiceImplServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getAdGroup method
     * override this method for handling normal response from getAdGroup operation
     */
    public void receiveResultgetAdGroup(
        net.daum.clix.api.group.service.GetAdGroupResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAdGroup operation
     */
    public void receiveErrorgetAdGroup(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAdGroupByCampaignID method
     * override this method for handling normal response from getAdGroupByCampaignID operation
     */
    public void receiveResultgetAdGroupByCampaignID(
        net.daum.clix.api.group.service.GetAdGroupByCampaignIDResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAdGroupByCampaignID operation
     */
    public void receiveErrorgetAdGroupByCampaignID(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateStatusForAdGroups method
     * override this method for handling normal response from updateStatusForAdGroups operation
     */
    public void receiveResultupdateStatusForAdGroups(
        net.daum.clix.api.group.service.UpdateStatusForAdGroupsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateStatusForAdGroups operation
     */
    public void receiveErrorupdateStatusForAdGroups(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getStatusForAdGroup method
     * override this method for handling normal response from getStatusForAdGroup operation
     */
    public void receiveResultgetStatusForAdGroup(
        net.daum.clix.api.group.service.GetStatusForAdGroupResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getStatusForAdGroup operation
     */
    public void receiveErrorgetStatusForAdGroup(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateStatusForAutobid method
     * override this method for handling normal response from updateStatusForAutobid operation
     */
    public void receiveResultupdateStatusForAutobid(
        net.daum.clix.api.group.service.UpdateStatusForAutobidResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateStatusForAutobid operation
     */
    public void receiveErrorupdateStatusForAutobid(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getStatusForAutobid method
     * override this method for handling normal response from getStatusForAutobid operation
     */
    public void receiveResultgetStatusForAutobid(
        net.daum.clix.api.group.service.GetStatusForAutobidResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getStatusForAutobid operation
     */
    public void receiveErrorgetStatusForAutobid(java.lang.Exception e) {
    }
}
