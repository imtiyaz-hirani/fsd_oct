package com.spring.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dto.RouteDto;
import com.spring.main.repository.RouteRepository;

@Service
public class RouteService {

	@Autowired
	private RouteRepository routeRepository;
	
	public List<RouteDto> getAllRoutes() {
		 
		return routeRepository.getAllRoutes();
	}

}
