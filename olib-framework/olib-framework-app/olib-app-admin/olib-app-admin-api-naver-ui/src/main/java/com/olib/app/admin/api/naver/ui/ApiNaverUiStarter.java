package com.olib.app.admin.api.naver.ui;

import org.springframework.stereotype.Component;

import com.olib.core.domain.AbstractOlibAppStarter;

@Component
public class ApiNaverUiStarter extends AbstractOlibAppStarter{

	@Override
	public String getModuleName() {
		return "api-naver-ui";
	}
	
	public static void main(String[] ar){
		
	}
}
