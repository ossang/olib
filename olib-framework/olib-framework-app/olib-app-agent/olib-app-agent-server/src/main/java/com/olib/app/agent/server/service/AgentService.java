package com.olib.app.agent.server.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AgentService {

	public String execute(String command){
		try {
			return Runtime.getRuntime().exec(command).isAlive() +"";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	public String executeAndResult(String command){
		try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = null;
			StringBuffer sb = new StringBuffer();
			while((line = br.readLine()) != null){
				sb.append(line).append("\n");
			}
			br.close();
			return sb.toString();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	public String run(List<String> pathList, String command, boolean result){
		if(pathList != null && pathList.contains(command)){
			if(result){
				return executeAndResult(command);
			}else{
				return execute(command);
			}
		}
		return "pathList error";
	}
}
