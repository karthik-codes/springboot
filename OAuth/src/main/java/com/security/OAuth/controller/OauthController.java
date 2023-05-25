package com.security.OAuth.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.OAuth.securityConfig.securityConfig;
import com.security.OAuth.service.OauthService;

@RestController
@RequestMapping("/security")
public class OauthController {

	@Autowired
	OauthService oService;
	
	@Autowired
	securityConfig config;
	
	@GetMapping("/any")
	public String getAccess() {
		return "welcome to Oauth configuration";
	}
	
	@GetMapping("/oauth")
	public ResponseEntity<Map<String,String>> getMap(){
		return oService.getAvailableItems();
		
	}
}
