package com.spring.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.main.dto.SearchDto;
import com.spring.main.repository.SearchRepository;

@Service //registered the class as Service with Spring
public class SearchService {

	@Autowired
	private SearchRepository searchRepository;
	
	public List<SearchDto> fetchBuses(String source, String destination, String doj) {
		return searchRepository.fetchBuses(source,destination,doj);
		
	}

}
