package com.olib.app.agent.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("file:./properties/agent.properties")
@SpringBootApplication
public class OlibServerMonitorAgentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlibServerMonitorAgentApplication.class, args);
	}
}
