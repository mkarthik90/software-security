package edu.asu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {
	
	@GetMapping(value = "/hello")
	public String test() {
		return "test";
	}

}
