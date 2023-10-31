package com.spring.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.repository.SearchRepository;

@Service //registered the class as Service with Spring
public class SearchService {

	@Autowired
	private SearchRepository searchRepository;
	
	public void fetchBuses(String source, String destination, String doj) {
		
		
	}

}
