package com.example.SpringBoot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringBoot2Application.class, args);
	}
		System.out.println("Welcome to Spring Concept Demo");

		ApplicationContext context = SpringApplication.run(SpringBoot2Application.class, args);

		System.out.println("Checking Context: " + context.getBean(DemoBean.class));

}
