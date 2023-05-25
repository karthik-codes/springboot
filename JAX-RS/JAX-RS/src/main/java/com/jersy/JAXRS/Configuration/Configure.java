package com.jersy.JAXRS.Configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.jersy.JAXRS.Controller.JaxController;
import com.jersy.JAXRS.requestFilters.RequestLoggingFilter;

@Component
public class Configure extends ResourceConfig {
	
	 public Configure() {
		  register(JaxController.class);
		  register(RequestLoggingFilter.class);
		 }
}
