package com.group4.Heper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailSender implements EmailHepper {
	@Autowired
	JavaMailSender sendEmail;

	@Async
	public void sendEmail(SimpleMailMessage mailMessage) {
	sendEmail.send(mailMessage);
		
	}

}
