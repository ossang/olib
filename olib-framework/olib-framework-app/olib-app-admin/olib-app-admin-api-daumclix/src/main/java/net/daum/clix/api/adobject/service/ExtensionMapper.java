/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */
package net.daum.clix.api.adobject.service;


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
                "getAdObjects".equals(typeName)) {
            return net.daum.clix.api.adobject.service.GetAdObjects.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adObjectTO".equals(typeName)) {
            return net.daum.clix.api.adobject.service.AdObjectTO.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "adObjectStatus".equals(typeName)) {
            return net.daum.clix.api.adobject.service.AdObjectStatus.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdObjectResponse".equals(typeName)) {
            return net.daum.clix.api.adobject.service.GetAdObjectResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdObject".equals(typeName)) {
            return net.daum.clix.api.adobject.service.GetAdObject.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAdObjectsResponse".equals(typeName)) {
            return net.daum.clix.api.adobject.service.GetAdObjectsResponse.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
