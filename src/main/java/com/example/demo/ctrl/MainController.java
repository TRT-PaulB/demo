package com.example.demo.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping(value = "/hello")
	public String getTest() {
		return "just testing...";
	}
	
	// http://localhost:8080/hello

}
