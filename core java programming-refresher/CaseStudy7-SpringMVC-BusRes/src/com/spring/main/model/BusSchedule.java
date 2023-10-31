package com.spring.main.model;

import java.time.LocalDate;

public class BusSchedule {
	private int id;
	private LocalDate doj;
	private int noOfHours;
	private String timeOfJourney;
	private double fare;
	private int bus_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public String getTimeOfJourney() {
		return timeOfJourney;
	}

	public void setTimeOfJourney(String timeOfJourney) {
		this.timeOfJourney = timeOfJourney;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public int getBus_id() {
		return bus_id;
	}

	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}

}
