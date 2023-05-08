package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class LCsendmailserviceimpl implements LCsendmailservice {
	
	@Autowired
	private JavaMailSender javamailsenderimpl;

	@Override
	public void sendEmail(String yourname, String Email, String result) {
		SimpleMailMessage newEmail=new SimpleMailMessage();
		newEmail.setTo(Email);
		newEmail.setSubject("Love calculator App result");
		newEmail.setText("Hi "+yourname +"the result is"+result);
		javamailsenderimpl.send(newEmail);

	}

}
