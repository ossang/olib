/**
 * AdObjectServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.daum.clix.api.adobject.impl;


/*
 *  AdObjectServiceImplService java interface
 */
public interface AdObjectServiceImplService {
    /**
     * Auto generated method signature
     *
     * @param getAdObject0
     */
    public net.daum.clix.api.adobject.service.GetAdObjectResponseE getAdObject(
        net.daum.clix.api.adobject.service.GetAdObjectE getAdObject0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAdObject0
     */
    public void startgetAdObject(
        net.daum.clix.api.adobject.service.GetAdObjectE getAdObject0,
        final net.daum.clix.api.adobject.impl.AdObjectServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAdObjects2
     */
    public net.daum.clix.api.adobject.service.GetAdObjectsResponseE getAdObjects(
        net.daum.clix.api.adobject.service.GetAdObjectsE getAdObjects2)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAdObjects2
     */
    public void startgetAdObjects(
        net.daum.clix.api.adobject.service.GetAdObjectsE getAdObjects2,
        final net.daum.clix.api.adobject.impl.AdObjectServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
