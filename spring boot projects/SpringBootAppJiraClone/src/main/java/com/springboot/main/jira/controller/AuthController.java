package com.springboot.main.jira.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.jira.model.User;
import com.springboot.main.jira.service.UserService;


@RestController
public class AuthController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/login")
	public User login(Principal  principal) {  //u do not process login??????????????? Spring 
		//ask spring, who has logged in?? i vl give u the username 
		String username = principal.getName();
		User user = (User)userService.loadUserByUsername(username);
		return user; 
	}
}
