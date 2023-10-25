package com.model;

public class Flight {
	private int id;
	private String flightCode;
	private int airline_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public int getAirline_id() {
		return airline_id;
	}

	public void setAirline_id(int airline_id) {
		this.airline_id = airline_id;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightCode=" + flightCode + ", airline_id=" + airline_id + "]";
	}

}
