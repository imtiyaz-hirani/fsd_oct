package com.model;

public class Booking {
	private int id;
	private String source;
	private String destination;
	private double duration;
	private double fare;
	private String flightCode;
	private int numberAdults;
	private int numberChildren;
	private int numberInfant;
	private double totalFare;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public int getNumberAdults() {
		return numberAdults;
	}

	public void setNumberAdults(int numberAdults) {
		this.numberAdults = numberAdults;
	}

	public int getNumberChildren() {
		return numberChildren;
	}

	public void setNumberChildren(int numberChildren) {
		this.numberChildren = numberChildren;
	}

	public int getNumberInfant() {
		return numberInfant;
	}

	public void setNumberInfant(int numberInfant) {
		this.numberInfant = numberInfant;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

}
