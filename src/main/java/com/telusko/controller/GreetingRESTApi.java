package com.telusko.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRESTApi 
{
	
	@GetMapping("/")
	public String getGreeting()
	{
		return "Course is ending soon! Its time to revise.All the very best";
	}
}
