package com.spring.jenkins;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	
	@PostConstruct
	public void init() {
		logger.info("Application started");
	}

	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
