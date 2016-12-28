package com.olib.app.admin.api.daum.ui;

import org.springframework.stereotype.Component;

import com.olib.core.domain.AbstractOlibAppStarter;

@Component
public class ApiDaumUiStarter extends AbstractOlibAppStarter{

	@Override
	public String getModuleName() {
		return "api-daum-ui";
	}
	
	public static void main(String[] ar){
		
	}
}
