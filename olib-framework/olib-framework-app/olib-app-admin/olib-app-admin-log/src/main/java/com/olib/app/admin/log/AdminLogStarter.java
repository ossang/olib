package com.olib.app.admin.log;

import org.springframework.stereotype.Component;

import com.olib.core.domain.AbstractOlibAppStarter;

@Component
public class AdminLogStarter extends AbstractOlibAppStarter{

	@Override
	public String getModuleName() {
		return "admin-log";
	}
	
	public static void main(String[] ar){
		
	}
}
