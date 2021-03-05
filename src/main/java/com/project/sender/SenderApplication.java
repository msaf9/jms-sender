package com.project.sender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.project.sender")
@SpringBootApplication
public class SenderApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SenderApplication.class, args);
	}

}
