package com.spring.main.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.main.dto.SearchDto;
import com.spring.main.service.SearchService;

@Controller
public class SearchController {

	@Autowired //asking spring to wire the class and take care of the object : DI
	private SearchService searchService;  
	
	@RequestMapping("/search")
	public String readSearchInput(HttpServletRequest request) { //DI: Dependency Injection
		/* Read search parameters coming from JSP */
		String source =request.getParameter("source");
		String destination =request.getParameter("destination");
		String doj =request.getParameter("doj");
		
	//	System.out.println(source + "---" + destination + "---" + doj);
		/* Give these inputs to Service class and fetch the busses matching the inputs */
		List<SearchDto> list = searchService.fetchBuses(source,destination,doj);
		
		//list.stream().forEach(e-> System.out.println(e));
		/* Give the result as a List to searchResult jsp for display */
		request.setAttribute("list_result", list);
		return "searchResult";
	} 
	
	@RequestMapping("/book")
	public void book() {
		
	}
}
