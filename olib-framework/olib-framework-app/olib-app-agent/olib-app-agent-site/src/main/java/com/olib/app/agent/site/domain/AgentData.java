package com.olib.app.agent.site.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AgentData {
	public static enum STATUS{ON,ERROR,NEW}
	
	@Id
	@GeneratedValue
	private int id;
	
	private String agentId;
	private String ip;
	private String memo;
	private STATUS status;
	
	@Column
	@ElementCollection(targetClass=String.class)
	private List<String> commandList;
	
	public AgentData(){}
	public AgentData(String agentId, String ip, String memo){
		this.agentId = agentId;
		this.ip = ip;
		this.memo = memo;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public List<String> getCommandList() {
		return commandList;
	}

	public void setCommandList(List<String> commandList) {
		this.commandList = commandList;
	}
}
