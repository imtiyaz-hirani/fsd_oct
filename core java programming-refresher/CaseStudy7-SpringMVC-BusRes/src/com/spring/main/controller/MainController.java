package com.spring.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //this makes this class a controller class. 
public class MainController {

	static {
		System.out.println("STEP 3. Controller called...");
	}
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
}
//WEB-INF/jsps/home.jsp