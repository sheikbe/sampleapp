package com.testaws.rest;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class TestAWSRest {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}
}
