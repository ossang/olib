/**
 * CampaignServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.daum.clix.api.campaign.impl;


/*
 *  CampaignServiceImplService java interface
 */
public interface CampaignServiceImplService {
    /**
     * Auto generated method signature
     *
     * @param getStatusForCampaign0
     */
    public net.daum.clix.api.campaign.service.GetStatusForCampaignResponseE getStatusForCampaign(
        net.daum.clix.api.campaign.service.GetStatusForCampaignE getStatusForCampaign0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getStatusForCampaign0
     */
    public void startgetStatusForCampaign(
        net.daum.clix.api.campaign.service.GetStatusForCampaignE getStatusForCampaign0,
        final net.daum.clix.api.campaign.impl.CampaignServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getCampaign2
     */
    public net.daum.clix.api.campaign.service.GetCampaignResponseE getCampaign(
        net.daum.clix.api.campaign.service.GetCampaignE getCampaign2)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getCampaign2
     */
    public void startgetCampaign(
        net.daum.clix.api.campaign.service.GetCampaignE getCampaign2,
        final net.daum.clix.api.campaign.impl.CampaignServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getCampaignsByAccountID4
     */
    public net.daum.clix.api.campaign.service.GetCampaignsByAccountIDResponseE getCampaignsByAccountID(
        net.daum.clix.api.campaign.service.GetCampaignsByAccountIDE getCampaignsByAccountID4)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param getCampaignsByAccountID4
     */
    public void startgetCampaignsByAccountID(
        net.daum.clix.api.campaign.service.GetCampaignsByAccountIDE getCampaignsByAccountID4,
        final net.daum.clix.api.campaign.impl.CampaignServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateStatusForCampaigns6
     */
    public net.daum.clix.api.campaign.service.UpdateStatusForCampaignsResponseE updateStatusForCampaigns(
        net.daum.clix.api.campaign.service.UpdateStatusForCampaignsE updateStatusForCampaigns6)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateStatusForCampaigns6
     */
    public void startupdateStatusForCampaigns(
        net.daum.clix.api.campaign.service.UpdateStatusForCampaignsE updateStatusForCampaigns6,
        final net.daum.clix.api.campaign.impl.CampaignServiceImplServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
