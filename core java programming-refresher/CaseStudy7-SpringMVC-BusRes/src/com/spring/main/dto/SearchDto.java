package com.spring.main.dto;

 
public class SearchDto { //data transfer object
	private String busNo;
	private String source;
	private String destination;
	private String busOperatorName;
	private int noOfHours;
	private String doj;
	private double fare;

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
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

	public String getBusOperatorName() {
		return busOperatorName;
	}

	public void setBusOperatorName(String busOperatorName) {
		this.busOperatorName = busOperatorName;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	 

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "SearchDto [busNo=" + busNo + ", source=" + source + ", destination=" + destination
				+ ", busOperatorName=" + busOperatorName + ", noOfHours=" + noOfHours + ", doj=" + doj + ", fare="
				+ fare + "]";
	}

	
}
