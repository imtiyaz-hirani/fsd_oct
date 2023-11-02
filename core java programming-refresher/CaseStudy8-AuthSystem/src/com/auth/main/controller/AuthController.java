package com.auth.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.auth.main.dto.SignUpDto;
import com.auth.main.exception.InvalidCredentialsException;
import com.auth.main.service.AuthService;

@Controller
class AuthController {

	@Autowired
	private AuthService authService;
	
	@RequestMapping("/")
	public String home() {
		return "login";
	}
	
	@RequestMapping("/sign-up")
	public String signUp() {
		return "signup";
	}
	
	@RequestMapping("/read-signup")
	public String readSignUp(HttpServletRequest request) {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String jobTitle=request.getParameter("jobTitle");
		String hasEmployeeId=request.getParameter("employeeId");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String repassword=request.getParameter("repassword");
		
		/* Attach these variables to Object */
		SignUpDto dto = new SignUpDto();
		dto.setName(name);
		dto.setEmail(email);
		dto.setJobTitle(jobTitle);
		dto.setHasEmployeeId(hasEmployeeId);
		dto.setUsername(username);
		dto.setPassword(password);
		dto.setRepassword(repassword);
		
		authService.signUp(dto);
		return "login";
	}
	
	@RequestMapping("/process-login")
	public String processLogin(HttpServletRequest request) {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try {
			authService.processLogin(username,password);
			return "employee_dashboard";
		} catch (InvalidCredentialsException e) {
			request.setAttribute("msg", e.getMessage());
			return "login";
		} 
	}
}
