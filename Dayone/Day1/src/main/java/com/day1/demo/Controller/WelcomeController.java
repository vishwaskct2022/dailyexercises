package com.day1.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome";
	}
	
}
