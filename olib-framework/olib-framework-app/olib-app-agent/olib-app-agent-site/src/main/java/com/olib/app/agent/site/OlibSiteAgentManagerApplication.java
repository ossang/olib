package com.olib.app.agent.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan("com.olib.*")
@PropertySource("file:./properties/agent-manager.properties")
public class OlibSiteAgentManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlibSiteAgentManagerApplication.class, args);
	}
}
