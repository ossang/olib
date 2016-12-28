/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */
package net.daum.clix.api.ad.service;


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
                "updateStatusForAds".equals(typeName)) {
            return net.daum.clix.api.ad.service.UpdateStatusForAds.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "updateStatusForAdsResponse".equals(typeName)) {
            return net.daum.clix.api.ad.service.UpdateStatusForAdsResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getStatusForAd".equals(typeName)) {
            return net.daum.clix.api.ad.service.GetStatusForAd.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adTO".equals(typeName)) {
            return net.daum.clix.api.ad.service.AdTO.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdsByAdGroupID".equals(typeName)) {
            return net.daum.clix.api.ad.service.GetAdsByAdGroupID.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adStatusTO".equals(typeName)) {
            return net.daum.clix.api.ad.service.AdStatusTO.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getStatusForAdResponse".equals(typeName)) {
            return net.daum.clix.api.ad.service.GetStatusForAdResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdResponse".equals(typeName)) {
            return net.daum.clix.api.ad.service.GetAdResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adResponse".equals(typeName)) {
            return net.daum.clix.api.ad.service.AdResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adStatus".equals(typeName)) {
            return net.daum.clix.api.ad.service.AdStatus.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdsByAdGroupIDResponse".equals(typeName)) {
            return net.daum.clix.api.ad.service.GetAdsByAdGroupIDResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAd".equals(typeName)) {
            return net.daum.clix.api.ad.service.GetAd.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "updateMaxBidForAdsResponse".equals(typeName)) {
            return net.daum.clix.api.ad.service.UpdateMaxBidForAdsResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "updateMaxBidForAds".equals(typeName)) {
            return net.daum.clix.api.ad.service.UpdateMaxBidForAds.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
