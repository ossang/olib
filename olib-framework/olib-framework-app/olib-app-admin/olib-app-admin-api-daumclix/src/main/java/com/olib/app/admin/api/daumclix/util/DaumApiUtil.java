package com.olib.app.admin.api.daumclix.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;

import com.olib.app.admin.api.daumclix.model.DaumHeader;
import com.olib.app.admin.api.daumclix.model.DaumParam;

public class DaumApiUtil {
//	private static final String SOAP_NS = "http://schemas.xmlsoap.org/soap/encoding/";
//	private static final String SOAP = "SOAP-ENV";
	private static final String WSSE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	private static final String WSU = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
	private static final String DIGEST_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest";
	private static final String ENCODING_TYPE = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary";
	private static final String SECURITY="Security";
	private static final String USERNAMETOKEN = "UsernameToken";
	private static final String USERNAME = "Username";
	private static final String PASSWORD = "Password";
	private static final String NONCE = "Nonce";
	private static final String CREATED = "Created";
	/*
	 * <wsse:Security SOAP-ENV:mustUnderstand="1" xmlns:wsse="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd">  
           <wsse:UsernameToken wsu:Id="UsernameToken-13" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd">  
              <wsse:Username>라이센스ID</wsse:Username>  
              <wsse:Password Type="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest">pswdDigest</wsse:Password>  
              <wsse:Nonce EncodingType="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary">nonceEncoded</wsse:Nonce>  
              <wsu:Created>createdStr</wsu:Created>  
           </wsse:UsernameToken>  
        </wsse:Security>  
	 */
	public static OMElement makeHeader(DaumParam param){
		DaumHeader daumHeader = createHeaderData(param);
		
		OMFactory omFactory = OMAbstractFactory.getOMFactory();
		OMElement security, userNameToken, userName, password, nonce, created;
		
		OMNamespace wsse_namespace = omFactory.createOMNamespace(WSSE, "wsse");
		OMNamespace wsu_namespace = omFactory.createOMNamespace(WSU, "wsu");
		
		security = omFactory.createOMElement(SECURITY, wsse_namespace);
		security.declareNamespace(wsse_namespace);
		OMAttribute mustUnderstand = omFactory.createOMAttribute("mustUnderstand", wsse_namespace, "1");
		security.addAttribute(mustUnderstand);
		
		userNameToken = omFactory.createOMElement(USERNAMETOKEN, wsse_namespace);
		userNameToken.declareNamespace(wsu_namespace);
		OMAttribute userToken = omFactory.createOMAttribute("Id", wsse_namespace, "UsernameToken-13");
		userNameToken.addAttribute(userToken);
		security.addChild(userNameToken);
		
		userName = omFactory.createOMElement(USERNAME, wsse_namespace);
		userName.setText(param.getId());
		userNameToken.addChild(userName);
		
		password = omFactory.createOMElement(PASSWORD, wsse_namespace);
		OMAttribute typeAttr = omFactory.createOMAttribute("Type", null, DIGEST_TYPE);
		password.addAttribute(typeAttr);
		password.setText(daumHeader.getDigest());
		userNameToken.addChild(password);
		
		nonce = omFactory.createOMElement(NONCE, wsse_namespace);
		OMAttribute encodingTypeAttr = omFactory.createOMAttribute("EncodingType", null, ENCODING_TYPE);
		nonce.addAttribute(encodingTypeAttr);
		nonce.setText(daumHeader.getNonce());
		userNameToken.addChild(nonce);
		
		created = omFactory.createOMElement(CREATED, wsu_namespace);
		created.setText(daumHeader.getCreatedDate());
		userNameToken.addChild(created);

		return security;
	}
	
	public static DaumHeader createHeaderData(DaumParam param){
		DaumHeader daumHeader = new DaumHeader();
		 try {  
	            String passwordStr = param.getPassword();  
	            String pswdDigest = "";  
	            String nonceEncoded = "";  
	            String createdStr = "";  
	  
	            org.apache.commons.codec.binary.Base64 base64 = new org.apache.commons.codec.binary.Base64();  
	            long now = System.currentTimeMillis();  
	            java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");  
	            createdStr = df.format(new java.util.Date(now));  
	            createdStr = createdStr.trim();  
	  
	            daumHeader.setCreatedDate(createdStr);
	  
	            long nonce = 2463229692218016647L;  
	            byte[] nonceBytes = String.valueOf(nonce).getBytes("UTF-8");  
	            nonceEncoded = new String(base64.encode(nonceBytes), "UTF-8");  
	            nonceEncoded = nonceEncoded.trim();  
	  
	            daumHeader.setNonce(nonceEncoded);
	  
	            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-1");  
	            md.reset();  
	            md.update(nonceBytes);  
	            md.update(createdStr.getBytes("UTF-8"));  
	            md.update(passwordStr.getBytes("UTF-8"));  
	            pswdDigest = new String(base64.encode(md.digest()), "UTF-8");  
	            pswdDigest = pswdDigest.trim();  
	  
	            daumHeader.setDigest(pswdDigest);
	  
	            } catch (UnsupportedEncodingException e) {  
	                e.printStackTrace();  
	            } catch (NoSuchAlgorithmException e) {  
	                e.printStackTrace();  
	        }  
		 
		 return daumHeader;
	}
	
}
