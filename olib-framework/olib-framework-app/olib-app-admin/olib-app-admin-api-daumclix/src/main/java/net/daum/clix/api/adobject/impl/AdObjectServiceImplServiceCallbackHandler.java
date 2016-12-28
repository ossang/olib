/**
 * AdObjectServiceImplServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.daum.clix.api.adobject.impl;


/**
 *  AdObjectServiceImplServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class AdObjectServiceImplServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public AdObjectServiceImplServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public AdObjectServiceImplServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getAdObject method
     * override this method for handling normal response from getAdObject operation
     */
    public void receiveResultgetAdObject(
        net.daum.clix.api.adobject.service.GetAdObjectResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAdObject operation
     */
    public void receiveErrorgetAdObject(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getAdObjects method
     * override this method for handling normal response from getAdObjects operation
     */
    public void receiveResultgetAdObjects(
        net.daum.clix.api.adobject.service.GetAdObjectsResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getAdObjects operation
     */
    public void receiveErrorgetAdObjects(java.lang.Exception e) {
    }
}
