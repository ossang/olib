package com.olib.app.agent.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olib.app.agent.server.service.AgentPropertiesService;
import com.olib.app.agent.server.service.AgentService;
import com.olib.app.agent.server.util.AgentUtil;

@RestController
public class AgentController {

	@Autowired
	private AgentPropertiesService propertiesService;
	
	@Autowired
	private AgentService service;
	
	@RequestMapping(value="/path",method=RequestMethod.GET)
	public String executePathList(){
		return propertiesService.getPathString();
	}
	
	@RequestMapping(value="/run",method=RequestMethod.GET)
	public String run(
			HttpServletRequest request,
			@RequestParam (value="path", required=true) String path,
			@RequestParam (value="result", required=true) boolean result){
		
		AgentUtil.saveAccessLog(request, String.format("run => %s", path));
		return service.run(propertiesService.getPath(),path,result);
	}
	
	
}
