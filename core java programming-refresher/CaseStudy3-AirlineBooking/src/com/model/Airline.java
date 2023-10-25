package com.model;

public class Airline {

	private int id;
	private String name;

	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airline(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Airline [id=" + id + ", name=" + name + "]";
	}

	
}
