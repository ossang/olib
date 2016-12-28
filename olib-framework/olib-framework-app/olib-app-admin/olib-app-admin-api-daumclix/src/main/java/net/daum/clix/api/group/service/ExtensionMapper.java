/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */
package net.daum.clix.api.group.service;


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
                "updateStatusForAutobid".equals(typeName)) {
            return net.daum.clix.api.group.service.UpdateStatusForAutobid.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getStatusForAutobid".equals(typeName)) {
            return net.daum.clix.api.group.service.GetStatusForAutobid.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdGroupResponse".equals(typeName)) {
            return net.daum.clix.api.group.service.GetAdGroupResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "updateStatusForAdGroups".equals(typeName)) {
            return net.daum.clix.api.group.service.UpdateStatusForAdGroups.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adGroupStatusTO".equals(typeName)) {
            return net.daum.clix.api.group.service.AdGroupStatusTO.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdGroupByCampaignIDResponse".equals(typeName)) {
            return net.daum.clix.api.group.service.GetAdGroupByCampaignIDResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getStatusForAdGroup".equals(typeName)) {
            return net.daum.clix.api.group.service.GetStatusForAdGroup.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "updateStatusForAdGroupsResponse".equals(typeName)) {
            return net.daum.clix.api.group.service.UpdateStatusForAdGroupsResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adGroupStatus".equals(typeName)) {
            return net.daum.clix.api.group.service.AdGroupStatus.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getStatusForAdGroupResponse".equals(typeName)) {
            return net.daum.clix.api.group.service.GetStatusForAdGroupResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "updateStatusForAutobidResponse".equals(typeName)) {
            return net.daum.clix.api.group.service.UpdateStatusForAutobidResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adGroupTO".equals(typeName)) {
            return net.daum.clix.api.group.service.AdGroupTO.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adGroupResponse".equals(typeName)) {
            return net.daum.clix.api.group.service.AdGroupResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getStatusForAutobidResponse".equals(typeName)) {
            return net.daum.clix.api.group.service.GetStatusForAutobidResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdGroupByCampaignID".equals(typeName)) {
            return net.daum.clix.api.group.service.GetAdGroupByCampaignID.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdGroup".equals(typeName)) {
            return net.daum.clix.api.group.service.GetAdGroup.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
