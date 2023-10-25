package com.controller;

import java.util.List;
import java.util.Scanner;

import com.model.InternationalRoutes;
import com.service.AirlineService;

 
public class AirlineController {
	public static void main(String[] args) {
		AirlineService airlineService = new AirlineService();
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Welcome to My Airline");
		System.out.println("**********************");
		System.out.println("Enter the Source/From City:");
		String source = sc.next();
		System.out.println("Enter destination/To City: ");
		String destination = sc.next();
		List<InternationalRoutes> list = airlineService.fetchFlights(source,destination);
		
		for(InternationalRoutes route : list) {
			System.out.println(route);
		}
	}
}
