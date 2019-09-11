package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class Demo2Application {
	private static final Logger LOG = Logger.getLogger(Demo2Application.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
	@RequestMapping("/")

	public String home() {

		LOG.log(Level.INFO, "you called home");

		return "Hello World";

	}
}


