package com.olib.app.agent.server.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AgentPropertiesService implements InitializingBean{

	@Value("${agent.execute.path}")
	private String[] path;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(getPathString());
		System.out.println("------------------------------------------------------------------------------");
	}
	
	public String getPathString(){
		return Arrays.asList(this.path).stream().collect(Collectors.joining(","));
	}
	public List<String> getPath(){
		return Arrays.asList(this.path).stream().collect(Collectors.toList());
	}
}
