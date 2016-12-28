/**
 * AdGroupServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.daum.clix.api.group.impl;


/*
 *  AdGroupServiceImplService java interface
 */
public interface AdGroupServiceImplService {
    /**
     * Auto generated method signature
     *
     * @param getAdGroup0
     */
    public net.daum.clix.api.group.service.GetAdGroupResponseE getAdGroup(
        net.daum.clix.api.group.service.GetAdGroupE getAdGroup0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAdGroup0
     */
    public void startgetAdGroup(
        net.daum.clix.api.group.service.GetAdGroupE getAdGroup0,
        final net.daum.clix.api.group.impl.AdGroupServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getAdGroupByCampaignID2
     */
    public net.daum.clix.api.group.service.GetAdGroupByCampaignIDResponseE getAdGroupByCampaignID(
        net.daum.clix.api.group.service.GetAdGroupByCampaignIDE getAdGroupByCampaignID2)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getAdGroupByCampaignID2
     */
    public void startgetAdGroupByCampaignID(
        net.daum.clix.api.group.service.GetAdGroupByCampaignIDE getAdGroupByCampaignID2,
        final net.daum.clix.api.group.impl.AdGroupServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateStatusForAdGroups4
     */
    public net.daum.clix.api.group.service.UpdateStatusForAdGroupsResponseE updateStatusForAdGroups(
        net.daum.clix.api.group.service.UpdateStatusForAdGroupsE updateStatusForAdGroups4)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateStatusForAdGroups4
     */
    public void startupdateStatusForAdGroups(
        net.daum.clix.api.group.service.UpdateStatusForAdGroupsE updateStatusForAdGroups4,
        final net.daum.clix.api.group.impl.AdGroupServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getStatusForAdGroup6
     */
    public net.daum.clix.api.group.service.GetStatusForAdGroupResponseE getStatusForAdGroup(
        net.daum.clix.api.group.service.GetStatusForAdGroupE getStatusForAdGroup6)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getStatusForAdGroup6
     */
    public void startgetStatusForAdGroup(
        net.daum.clix.api.group.service.GetStatusForAdGroupE getStatusForAdGroup6,
        final net.daum.clix.api.group.impl.AdGroupServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateStatusForAutobid8
     */
    public net.daum.clix.api.group.service.UpdateStatusForAutobidResponseE updateStatusForAutobid(
        net.daum.clix.api.group.service.UpdateStatusForAutobidE updateStatusForAutobid8)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateStatusForAutobid8
     */
    public void startupdateStatusForAutobid(
        net.daum.clix.api.group.service.UpdateStatusForAutobidE updateStatusForAutobid8,
        final net.daum.clix.api.group.impl.AdGroupServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getStatusForAutobid10
     */
    public net.daum.clix.api.group.service.GetStatusForAutobidResponseE getStatusForAutobid(
        net.daum.clix.api.group.service.GetStatusForAutobidE getStatusForAutobid10)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getStatusForAutobid10
     */
    public void startgetStatusForAutobid(
        net.daum.clix.api.group.service.GetStatusForAutobidE getStatusForAutobid10,
        final net.daum.clix.api.group.impl.AdGroupServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
