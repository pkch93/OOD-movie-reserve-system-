package com.moviereserve.park.config.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource datasource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
			.authorizeRequests().antMatchers("/join").permitAll()
			.and()
			.authorizeRequests().anyRequest().authenticated()
			.and()
			.formLogin().loginPage("/login").permitAll()
			.and().logout()
			.logoutUrl("/park/logout")
			.logoutSuccessUrl("/")
			.and().exceptionHandling();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication()
			.withUser("pkch").password("1234").roles("USER", "ADMIN").and()
			.withUser("user").password("1234").roles("USER");
	}
	
	
}
