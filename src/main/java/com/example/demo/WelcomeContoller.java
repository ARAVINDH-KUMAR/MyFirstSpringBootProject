package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeContoller {
	@GetMapping("/Greetings")
	public String Greetings() {
		return "Aravindh's First Spring Boot Application";
	}
}
