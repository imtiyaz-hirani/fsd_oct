package com.service;

import java.util.List;

import com.model.InternationalRoutes;
import com.repository.AirlineRepository;

public class AirlineService {

	AirlineRepository airlineRepository = new AirlineRepository();
	
	public List<InternationalRoutes> fetchFlights(String source, String destination) {
		List<InternationalRoutes> list = airlineRepository.fetchFlights(source,destination);
		return list;
	}

}
