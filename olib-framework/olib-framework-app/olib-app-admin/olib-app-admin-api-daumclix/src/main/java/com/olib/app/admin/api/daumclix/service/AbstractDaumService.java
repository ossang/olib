package com.olib.app.admin.api.daumclix.service;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;

import com.olib.app.admin.api.daumclix.model.DaumParam;

/*
 * S : stub type
 */
public abstract class AbstractDaumService <S>{
	protected final long TIMEOUT = 2 * 60 * 1000; // Two minutes
	
	abstract public S getStub(DaumParam daumParam);
	
	public void stubCleanup(Stub stub){
		try {
			stub.cleanup();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
	}
	
	public <R extends org.apache.axis2.databinding.ADBBean ,T extends Stub> R[] execute(
			T stub,
			R[] result) {
		
		stubCleanup(stub);
		return result;
	}
	
	public <R extends org.apache.axis2.databinding.ADBBean ,T extends Stub> R execute(
			T stub,
			R result) {
		
		stubCleanup(stub);
		return result;
	}
}
