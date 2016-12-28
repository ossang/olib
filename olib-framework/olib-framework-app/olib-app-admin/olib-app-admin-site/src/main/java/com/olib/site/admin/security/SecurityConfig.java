package com.olib.site.admin.security;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	  protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
	    	.antMatchers("/admin/**").hasRole("ADMIN")
	        .antMatchers("/css/**", "/js/**","/webjars/**","classpath:/META-INF/resources/webjars/","**/*.ignore/**").permitAll()
	        .anyRequest().hasRole("USER")
	        .and()
	    .formLogin()	   		
	   		.loginPage("/login")
	   		.passwordParameter("password")
	   		.usernameParameter("username")
	   		.defaultSuccessUrl("/main")
	        .permitAll()
	        .and()
	        .logout()
	        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	        .logoutSuccessUrl("/login")
	        .deleteCookies("remember-me")
	        .permitAll()	    	
	        .and()
	        .rememberMe();
	  }
	   
	  @Override
	  public void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth
	      .inMemoryAuthentication()
	        .withUser("admin").password("olibadmin").roles("USER", "ADMIN").and()
	        .withUser("user").password("user").roles("USER");
	  }

}
