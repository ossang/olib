package com.olib.app.agent.site.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AgentManagerPropertiesService {

	@Value("${agent.get.url}")
	private String agentGetUrl;
	
	@Value("${agent.run.url}")
	private String agentRunUrl;

	public String getAgentGetUrl() {
		return agentGetUrl;
	}

	public void setAgentGetUrl(String agentGetUrl) {
		this.agentGetUrl = agentGetUrl;
	}

	public String getAgentRunUrl() {
		return agentRunUrl;
	}

	public void setAgentRunUrl(String agentRunUrl) {
		this.agentRunUrl = agentRunUrl;
	}
}
