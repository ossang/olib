/**
 * AdServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.daum.clix.api.ad.impl;


/*
 *  AdServiceImplService java interface
 */
public interface AdServiceImplService {
    /**
     * Auto generated method signature
     *
     * @param updateMaxBidForAds0
     */
    public net.daum.clix.api.ad.service.UpdateMaxBidForAdsResponseE updateMaxBidForAds(
        net.daum.clix.api.ad.service.UpdateMaxBidForAdsE updateMaxBidForAds0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateMaxBidForAds0
     */
    public void startupdateMaxBidForAds(
        net.daum.clix.api.ad.service.UpdateMaxBidForAdsE updateMaxBidForAds0,
        final net.daum.clix.api.ad.impl.AdServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getStatusForAd2
     */
    public net.daum.clix.api.ad.service.GetStatusForAdResponseE getStatusForAd(
        net.daum.clix.api.ad.service.GetStatusForAdE getStatusForAd2)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getStatusForAd2
     */
    public void startgetStatusForAd(
        net.daum.clix.api.ad.service.GetStatusForAdE getStatusForAd2,
        final net.daum.clix.api.ad.impl.AdServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAd4
     */
    public net.daum.clix.api.ad.service.GetAdResponseE getAd(
        net.daum.clix.api.ad.service.GetAdE getAd4)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAd4
     */
    public void startgetAd(net.daum.clix.api.ad.service.GetAdE getAd4,
        final net.daum.clix.api.ad.impl.AdServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAdsByAdGroupID6
     */
    public net.daum.clix.api.ad.service.GetAdsByAdGroupIDResponseE getAdsByAdGroupID(
        net.daum.clix.api.ad.service.GetAdsByAdGroupIDE getAdsByAdGroupID6)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAdsByAdGroupID6
     */
    public void startgetAdsByAdGroupID(
        net.daum.clix.api.ad.service.GetAdsByAdGroupIDE getAdsByAdGroupID6,
        final net.daum.clix.api.ad.impl.AdServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateStatusForAds8
     */
    public net.daum.clix.api.ad.service.UpdateStatusForAdsResponseE updateStatusForAds(
        net.daum.clix.api.ad.service.UpdateStatusForAdsE updateStatusForAds8)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateStatusForAds8
     */
    public void startupdateStatusForAds(
        net.daum.clix.api.ad.service.UpdateStatusForAdsE updateStatusForAds8,
        final net.daum.clix.api.ad.impl.AdServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
