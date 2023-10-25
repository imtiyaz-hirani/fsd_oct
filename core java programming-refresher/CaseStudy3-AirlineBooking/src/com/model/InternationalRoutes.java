package com.model;

public class InternationalRoutes {
	private int id;
	private String source;
	private String destination;
	private double duration;
	private double fare;
	private int flight_id;

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

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	@Override
	public String toString() {
		return "InternationalRoutes [id=" + id + ", source=" + source + ", destination=" + destination + ", duration="
				+ duration + ", fare=" + fare + ", flight_id=" + flight_id + "]";
	}

	
}
