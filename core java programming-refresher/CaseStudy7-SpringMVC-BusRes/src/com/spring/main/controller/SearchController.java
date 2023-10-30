package com.spring.main.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

	@RequestMapping("/search")
	public String readSearchInput(HttpServletRequest request) { //DI: Dependency Injection
		/* Read search parameters coming from JSP */
		String source =request.getParameter("source");
		String destination =request.getParameter("destination");
		String doj =request.getParameter("doj");
		
		System.out.println(source + "---" + destination + "---" + doj);
		/* Give these inputs to Service class and fetch the busses matching the inputs */
		
		/* Give the result as a List to searchResult jsp for display */
		return "searchResult";
	} 
}
