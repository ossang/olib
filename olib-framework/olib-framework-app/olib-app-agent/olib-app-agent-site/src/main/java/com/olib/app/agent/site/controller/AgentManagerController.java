package com.olib.app.agent.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.olib.app.agent.site.domain.AgentData;
import com.olib.app.agent.site.service.AgentManagerService;
import com.olib.core.base.BaseSiteController;

@Controller
public class AgentManagerController extends BaseSiteController{

	@Autowired
	private AgentManagerService service;
	

	@ResponseBody
	@RequestMapping(value="/agentlist",method=RequestMethod.GET)
	public List<AgentData> getAgentList(){
		return service.updateAllAgents();
	}

	@ResponseBody
	@RequestMapping(value="/agent",method=RequestMethod.POST)
	public boolean addAgent(
			@RequestBody String jsonData){
		
		return service.addAgent(jsonData);
	}
	
	@ResponseBody
	@RequestMapping(value="/agent",method=RequestMethod.DELETE)
	public void deleteAgent(
			@RequestBody String jsonData){
		
		service.deleteAgent(jsonData);
	}
	@ResponseBody
	@RequestMapping(value="/run",method=RequestMethod.GET)
	public List<String> runAgent(
			@RequestParam(value="agentId") String agentId,
			@RequestParam(value="path") String path
			){
		
		return service.runAgent(agentId,path);
	}
	
}
