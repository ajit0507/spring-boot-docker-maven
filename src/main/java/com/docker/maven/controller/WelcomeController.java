package com.docker.maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("hello")
	String getMessage()
	{
		System.out.println("WelcomeController.getMessage()");
		return "Welocome to Docker-SPringboot-Maven";
	}
}
