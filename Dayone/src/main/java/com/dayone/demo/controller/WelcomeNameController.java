package com.dayone.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeNameController {

	@GetMapping("/")
	public String getName()
	{
		return "Welcome Sarumathi!";
	}
}
