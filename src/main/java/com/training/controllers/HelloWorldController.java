package com.training.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	private static Log log=LogFactory.getLog(HelloWorldController.class);
	@GetMapping("hello")
	String m1() {
		log.info("greeting the world");
		return "hello world!!";
	}

}
