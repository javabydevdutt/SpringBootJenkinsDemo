package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJenkinsDemoApplication {

	@GetMapping("/wish")
	public String wish() {
		String msg = "Welcome to Jenkins with Sroing boot";
		return msg;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsDemoApplication.class, args);
	}

}
