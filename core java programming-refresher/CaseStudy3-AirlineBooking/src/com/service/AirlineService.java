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

	public double computeTotalFare(int flightID, 
			int numberAdults, int numberChildren, int numberInfants) {
		double fare = airlineRepository.getDetailsByFlightId(flightID);
		double totalFare = 0; 
		
		totalFare = (fare * numberAdults);
		totalFare = totalFare + (fare * numberChildren);
		totalFare = totalFare + ((fare * 0.2) * numberInfants);
		return totalFare;
	}

}

/* 
 * Full Fare for Adults
 * Full Fare for children
 * 20% of Full Fare as convenience fee for each infant  
 * */
