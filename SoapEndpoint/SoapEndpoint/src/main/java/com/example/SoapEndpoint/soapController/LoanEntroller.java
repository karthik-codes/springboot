package com.example.SoapEndpoint.soapController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.PayloadRoots;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.SoapEndpoint.service.LoanEligibility;
import com.soapexample.spring.soap.api.loaneligibility.Acknowledgement;
import com.soapexample.spring.soap.api.loaneligibility.CustomerRequest;

@Endpoint
public class LoanEntroller {

	private static final String Namespace="http://www.soapexample.com/spring/soap/api/loanEligibility";
	
	@Autowired
	private LoanEligibility eligibility;
	
	@PayloadRoot(namespace=Namespace,localPart = "CustomerRequest")
	@ResponsePayload
	public Acknowledgement getEligibility(@RequestPayload CustomerRequest cust) {
		return eligibility.checkEligibility(cust);
	}
	
	@PayloadRoot(namespace=Namespace,localPart = "getGreeting")
	@ResponsePayload
	public String getgreeting() {
		return "say Hi:";
	}
}
