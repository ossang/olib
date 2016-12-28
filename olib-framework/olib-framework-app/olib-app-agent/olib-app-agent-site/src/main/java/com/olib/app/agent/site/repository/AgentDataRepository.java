package com.olib.app.agent.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.olib.app.agent.site.domain.AgentData;

@Repository
public interface AgentDataRepository extends JpaRepository<AgentData,Integer>{

	@Transactional
	public void deleteByAgentId(String agentId);
	
	public AgentData findByAgentId(String agentId);
	
}
