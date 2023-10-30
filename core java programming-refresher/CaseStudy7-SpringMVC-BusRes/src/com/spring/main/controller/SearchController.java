package com.spring.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

	@RequestMapping("/search")
	public String readSearchInput() {
		/* Read search parameters coming from JSP */
		
		/* Give these inputs to Service class and fetch the busses matching the inputs */
		
		/* Give the result as a List to searchResult jsp for display */
		return "searchResult";
	} 
}
