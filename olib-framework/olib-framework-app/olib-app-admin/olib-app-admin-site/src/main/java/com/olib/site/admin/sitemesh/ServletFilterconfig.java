package com.olib.site.admin.sitemesh;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletFilterconfig {

	@Bean
	public FilterRegistrationBean sitemeshFilter() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new SiteMeshFilter());
		return filterRegistrationBean;
	}

}