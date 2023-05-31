package com.example.SoapEndpoint.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.soapexample.spring.soap.api.loaneligibility.Acknowledgement;
import com.soapexample.spring.soap.api.loaneligibility.CustomerRequest;

@Service
public class LoanEligibility {

	
	public Acknowledgement checkEligibility(CustomerRequest customer) {
		Acknowledgement ack = new Acknowledgement();
		List<String> criteria=ack.getCriteriaMismatch();
		if (!(customer.getAge() > 30 && customer.getAge() <= 60)) {
			criteria.add("Person age should in between 30 to 60");
		}
		if (!(customer.getYearlyIncome() > 200000)) {
			criteria.add("minimum income should be more than 200000");
		}
		if (!(customer.getCibilScore() >= 500)) {
			criteria.add("Low CIBIL Score please try after 6 month");
		}
			if(criteria.size()>0) {
				ack.setApprovedAmount(0);
				ack.setIsEligible(false);
			}
			else {
				ack.setApprovedAmount(500000);
				ack.setIsEligible(true);
				criteria.clear();
			}
			return ack;
	}
}
