package com.spring.main.dto;

public class RouteDto {
	private int bus_id;
	private String source;
	private String destination;
	private String bus_operator;
	private String operator_city;
	private int noOfHours;
	private double fare;

	public int getBus_id() {
		return bus_id;
	}

	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getBus_operator() {
		return bus_operator;
	}

	public void setBus_operator(String bus_operator) {
		this.bus_operator = bus_operator;
	}

	public String getOperator_city() {
		return operator_city;
	}

	public void setOperator_city(String operator_city) {
		this.operator_city = operator_city;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "RouteDto [bus_id=" + bus_id + ", source=" + source + ", destination=" + destination + ", bus_operator="
				+ bus_operator + ", operator_city=" + operator_city + ", noOfHours=" + noOfHours + ", fare=" + fare
				+ "]";
	}

}