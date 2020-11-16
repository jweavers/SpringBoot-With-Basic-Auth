package com.springboot.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.app.mail.EmailService;
import com.springboot.app.mail.Mail;

@SpringBootApplication
public class MySpringBootApp implements ApplicationRunner {
	
	@Autowired
    private EmailService emailService;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = SpringApplication.run(MySpringBootApp.class, args);
		
	}
	
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        Mail mail = new Mail();
        mail.setFrom("Last-Day@oracle.com");
        mail.setBcc("ravi.kant.sharma@oracle.com");
        mail.setReplyTo("raviksharma.1991@gmail.com");
        mail.setSubject("Thank You!!");
        mail.setContent("This tutorial demonstrates how to send a simple email using Spring Framework.");

        emailService.sendSimpleMessage(mail);
    }

}
