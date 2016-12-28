package com.olib.site.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.olib.*")
public class OlibSiteAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlibSiteAdminApplication.class, args);
	}
}
