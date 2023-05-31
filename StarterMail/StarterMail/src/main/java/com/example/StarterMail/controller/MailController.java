package com.example.StarterMail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StarterMail.Entity.AttachmentEntity;
import com.example.StarterMail.Entity.EmailEntity;
import com.example.StarterMail.service.EmailService;

@RestController
@RequestMapping("/sendMail")
public class MailController {
	
	@Autowired
	EmailService eService;
	
	
	@PostMapping()
	public String sendMail(@RequestBody EmailEntity em) {
		System.out.println("email sent");
		return eService.sendEmail(em)+": email sent";
		
	}
	
	@PostMapping("/attachment-link")
	public ResponseEntity<String> getMailWithAttachment(@RequestBody AttachmentEntity en){
		return eService.sendAttachmentEmail(en);
	}

}
