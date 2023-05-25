package com.security.OAuth.securityConfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

@Configuration
@EnableWebSecurity
public class securityConfig {

	SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		return http.authorizeHttpRequests(auth -> {
			auth.anyRequest().authenticated();
		}).oauth2Login().and().exceptionHandling(e->e.authenticationEntryPoint(new HttpStatusEntryPoint(
				HttpStatus.UNAUTHORIZED))).formLogin(Customizer.withDefaults()).build();
	}
		
	}

