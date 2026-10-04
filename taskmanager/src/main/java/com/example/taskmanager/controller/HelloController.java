package com.example.taskmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// GET http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Task Manager!";
	}

	// GET http://localhost:8080/greet?name=Raheel
	@GetMapping("/greet")
	public String greet(@RequestParam(defaultValue = "World") String name) {
		return "Hello, " + name + "!";
	}
}
