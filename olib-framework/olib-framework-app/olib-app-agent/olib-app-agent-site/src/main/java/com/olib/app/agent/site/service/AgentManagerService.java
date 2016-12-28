package com.olib.app.agent.site.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olib.app.agent.site.domain.AgentData;
import com.olib.app.agent.site.domain.AgentData.STATUS;
import com.olib.app.agent.site.env.AgentManagerEnv;
import com.olib.app.agent.site.repository.AgentDataRepository;
import com.olib.app.agent.site.util.AgentManagerUtil;
import com.olib.core.util.OlibJsonUtil;

@Service
public class AgentManagerService {

	@Autowired
	private AgentDataRepository repository;
	
	@Autowired
	private AgentManagerPropertiesService properties;
	
	public List<AgentData> getAgentList(){
		return repository.findAll();
	}
	
	public boolean addAgent(String agentId, String ip, String memo) {
		try{
			AgentData agentData = repository.findByAgentId(agentId);
			if(agentData != null) return false;
					
			agentData = updateAgentData(agentId,ip,memo);
			repository.save(agentData);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean removeAgent(String agentId){
		return false;
	}
	
	public String getUrl(String ip, String url){
		return String.format("http://%s%s",ip,url);
	}
	
	public AgentData updateAgentData(String agentId, String ip, String memo){
		AgentData agentData = new AgentData(agentId,ip,memo);
		String url = getUrl(ip,properties.getAgentGetUrl());
		String response = AgentManagerUtil.request(url);
		if(response == null){
			agentData.setStatus(STATUS.ERROR);
		}else{
			agentData.setStatus(STATUS.ON);
			agentData.setCommandList(Arrays.asList(response.split(",")));
		}
		
		return agentData;
	}
	
	public List<AgentData> updateAllAgents(){
		List<AgentData> agentList = getAgentList();
		if(agentList == null) return null;
		String url = null;
		String response = null;
		for(AgentData agent : agentList){
			url = getUrl(agent.getIp(), properties.getAgentGetUrl());
			response = AgentManagerUtil.request(url);
			if(response == null){
				agent.setStatus(STATUS.ERROR);
				agent.setCommandList(null);
			}else{
				agent.setStatus(STATUS.ON);
				agent.setCommandList(Arrays.asList(response.split(",")));
			}
		}
		return agentList;
	}

	public boolean addAgent(String jsonData) {
		String data = (String) OlibJsonUtil.getJsonData(jsonData, AgentManagerEnv.JSON_DATA);
		String agentId = (String) OlibJsonUtil.getJsonData(data, AgentManagerEnv.AGENT_ID);
		String ip = (String) OlibJsonUtil.getJsonData(data, AgentManagerEnv.AGENT_IP);
		String memo = (String) OlibJsonUtil.getJsonData(data, AgentManagerEnv.AGENT_MEMO);
		
		return addAgent(agentId, ip, memo);
	}
	
	public void deleteAgent(String jsonData){
		String data = (String) OlibJsonUtil.getJsonData(jsonData, AgentManagerEnv.JSON_DATA);
		String agentId = (String) OlibJsonUtil.getJsonData(data, AgentManagerEnv.AGENT_ID);
		
		repository.deleteByAgentId(agentId);
	}

	public List<String> runAgent(String agentId, String path) {
		AgentData agent = repository.findByAgentId(agentId);
		StringBuffer url = new StringBuffer();
		url.append(getUrl(agent.getIp(), properties.getAgentRunUrl()));
		url.append("?path=").append(path);
		url.append("&result=").append((path.indexOf("agentps") >= 0)?true:false);
		
		return Arrays.asList(AgentManagerUtil.request(url.toString()).split("\n"));
	}
}
