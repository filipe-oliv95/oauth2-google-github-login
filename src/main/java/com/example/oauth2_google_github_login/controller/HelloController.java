package com.example.oauth2_google_github_login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping
	public String hello () {
		return "Hello World";
	}
	
}
