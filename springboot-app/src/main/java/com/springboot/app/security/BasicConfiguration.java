package com.springboot.app.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class BasicConfiguration extends WebSecurityConfigurerAdapter {
 
    @Override
    protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    	
        auth
          .inMemoryAuthentication()
          .withUser("user")
            .password("{noop}password")
            .roles("USER").and()
          .withUser("admin")
            .password("{noop}admin")
            .roles("ADMIN","USER");
    }

 
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		
        http.httpBasic().and()
          .authorizeRequests()
          .antMatchers("/add","/addAll").hasAnyRole("ADMIN")
          .antMatchers("/get/**","/getAll").hasRole("USER").and().csrf().disable();
          
    }
	
	
}