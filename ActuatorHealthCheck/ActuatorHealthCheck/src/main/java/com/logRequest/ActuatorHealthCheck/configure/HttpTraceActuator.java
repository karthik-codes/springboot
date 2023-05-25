package com.logRequest.ActuatorHealthCheck.configure;

import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("/cart")
public class HttpTraceActuator {

	
	 @Bean
	    public HttpExchangeRepository htt() {
	        return new InMemoryHttpExchangeRepository();
	    }
}
