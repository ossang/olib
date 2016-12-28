/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */
package net.daum.clix.api.account.service;


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
                "getAccountsResponse".equals(typeName)) {
            return net.daum.clix.api.account.service.GetAccountsResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAccount".equals(typeName)) {
            return net.daum.clix.api.account.service.GetAccount.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAccountsByPage".equals(typeName)) {
            return net.daum.clix.api.account.service.GetAccountsByPage.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "accountTO".equals(typeName)) {
            return net.daum.clix.api.account.service.AccountTO.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAccountBalanceResponse".equals(typeName)) {
            return net.daum.clix.api.account.service.GetAccountBalanceResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "accountBalanceTO".equals(typeName)) {
            return net.daum.clix.api.account.service.AccountBalanceTO.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAccountResponse".equals(typeName)) {
            return net.daum.clix.api.account.service.GetAccountResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAccountsByPageResponse".equals(typeName)) {
            return net.daum.clix.api.account.service.GetAccountsByPageResponse.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAccountBalance".equals(typeName)) {
            return net.daum.clix.api.account.service.GetAccountBalance.Factory.parse(reader);
        }

        if ("http://service.api.clix.daum.net/".equals(namespaceURI) &&
                "getAccounts".equals(typeName)) {
            return net.daum.clix.api.account.service.GetAccounts.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
