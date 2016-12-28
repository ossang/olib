package com.olib.app.agent.ui;

import org.springframework.stereotype.Component;

import com.olib.core.domain.AbstractOlibAppStarter;

@Component
public class AgentUiStarter extends AbstractOlibAppStarter{

	@Override
	public String getModuleName() {
		return "agent-ui";
	}
	
	public static void main(String[] ar){}

}
