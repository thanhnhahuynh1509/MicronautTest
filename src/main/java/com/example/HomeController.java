package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("hello")
public class HomeController {

	@Get
	public String index() {
		return "Hello World!!!";
	}

	@Get("test")
	public String test() {
		return "Test";
	}
}
