package com.spring.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.main.dto.RouteDto;
import com.spring.main.service.RouteService;

@Controller
public class RouteController {  

	@Autowired
	private RouteService routeService; //DI
	
	@RequestMapping("/all-routes")
	public String getAllRoutes(Model model) {  //DI 
		 List<RouteDto> list = routeService.getAllRoutes();
		 model.addAttribute("list", list);
		return "routes";
	} 
	
} 
