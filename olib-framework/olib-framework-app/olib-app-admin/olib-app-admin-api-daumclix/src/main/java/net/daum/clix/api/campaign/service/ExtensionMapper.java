/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */
package net.daum.clix.api.campaign.service;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getCampaign".equals(typeName)) {
            return net.daum.clix.api.campaign.service.GetCampaign.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getCampaignsByAccountID".equals(typeName)) {
            return net.daum.clix.api.campaign.service.GetCampaignsByAccountID.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "updateStatusForCampaigns".equals(typeName)) {
            return net.daum.clix.api.campaign.service.UpdateStatusForCampaigns.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "campaignTO".equals(typeName)) {
            return net.daum.clix.api.campaign.service.CampaignTO.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getCampaignsByAccountIDResponse".equals(typeName)) {
            return net.daum.clix.api.campaign.service.GetCampaignsByAccountIDResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "campaignResponse".equals(typeName)) {
            return net.daum.clix.api.campaign.service.CampaignResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getCampaignResponse".equals(typeName)) {
            return net.daum.clix.api.campaign.service.GetCampaignResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "campaignStatusTO".equals(typeName)) {
            return net.daum.clix.api.campaign.service.CampaignStatusTO.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getStatusForCampaignResponse".equals(typeName)) {
            return net.daum.clix.api.campaign.service.GetStatusForCampaignResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "updateStatusForCampaignsResponse".equals(typeName)) {
            return net.daum.clix.api.campaign.service.UpdateStatusForCampaignsResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "campaignStatus".equals(typeName)) {
            return net.daum.clix.api.campaign.service.CampaignStatus.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getStatusForCampaign".equals(typeName)) {
            return net.daum.clix.api.campaign.service.GetStatusForCampaign.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
