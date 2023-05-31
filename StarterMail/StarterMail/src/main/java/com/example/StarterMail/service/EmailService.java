package com.example.StarterMail.service;



import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.StarterMail.Entity.AttachmentEntity;
import com.example.StarterMail.Entity.EmailEntity;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

	@Autowired
	JavaMailSender eMail;
	
	
	public String  sendEmail( EmailEntity mail) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(mail.getFromMail());
		message.setTo(mail.getToMail());
		message.setSubject(mail.getSubject());
		message.setText(mail.getBody());
		eMail.send(message);
		return message.getFrom()+" :mail recieved";
	} 
	
	public ResponseEntity<String> sendAttachmentEmail(AttachmentEntity entity) {
		try {
			String link="https://mail.google.com";
			
		MimeMessage message=eMail.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(message, true);
		    helper.setFrom(entity.getFromMail());
			helper.setTo(entity.getToMail());
			helper.setSubject(entity.getSubject());
			helper.setText("click this link :","<html><a href="+link+">click here :</a></html>");
			FileSystemResource resource = new FileSystemResource(new File(entity.getAttachment()));
			helper.addAttachment(resource.getFilename(), resource);
			eMail.send(message);
			System.out.println("sent mail with link and attachment");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.ok("Email sent Successfully");
		
		
		
		
	}
}
