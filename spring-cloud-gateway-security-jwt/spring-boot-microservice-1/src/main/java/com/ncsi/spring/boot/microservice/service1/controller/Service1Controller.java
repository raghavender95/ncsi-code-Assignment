package com.ncsi.spring.boot.microservice.service1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {


	@GetMapping("/service1/{name}")
	public ResponseEntity<String> greetUser(@PathVariable String name) {
		return new ResponseEntity<String>("Hello, " + name, HttpStatus.OK);
	}
}
