package com.springboot.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MySpringBootApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = SpringApplication.run(MySpringBootApp.class, args);
	
	}

}
