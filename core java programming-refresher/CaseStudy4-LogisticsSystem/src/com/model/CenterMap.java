package com.model;

public class CenterMap {
	private int id;
	private String source;
	private String destination;
	private double distance;
	private int numberOfDays;

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

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	@Override
	public String toString() {
		return "CenterMap [id=" + id + ", source=" + source + ", destination=" + destination + ", distance=" + distance
				+ ", numberOfDays=" + numberOfDays + "]";
	}

}
