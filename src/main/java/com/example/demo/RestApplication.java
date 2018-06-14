package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RestApplication {

	private static final Logger log = LoggerFactory.getLogger(RestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
		log.info("Spring app initiated");
	}
	
}
