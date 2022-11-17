package com.restexample.restserviceexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping("/index")
	public String index() {
		return "hello!";
	}
	
	
	public Greeting greeting() {
		return new Greeting(1, "greetings!");
		
	}

}
