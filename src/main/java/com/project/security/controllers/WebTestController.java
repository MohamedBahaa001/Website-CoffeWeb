package com.project.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WebTestController {
	
	
	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome to spring boot heroku demo";
	}

}
