package com.example.SpringBoot2;

import com.example.SpringBoot2.Component.DemoBean;
import com.example.SpringBoot2.Component.EmployeeBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2Application {
	public static final Logger logger = LoggerFactory.getLogger(SpringBoot2Application.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");

		ApplicationContext context = SpringApplication.run(SpringBoot2Application.class, args);

		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowired annotation on property ***");

		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.getDeptBean().setDeptName("Information Technology");
		employeeBean.showEmployeeDetails();

	}
}