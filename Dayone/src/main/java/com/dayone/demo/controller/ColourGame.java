package com.dayone.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColourGame {

	@GetMapping("/colour")
	public String getMyFav()
	{
		return "My favourite colour is Black";
	}
}
