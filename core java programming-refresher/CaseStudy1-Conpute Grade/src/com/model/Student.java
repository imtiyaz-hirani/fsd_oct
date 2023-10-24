package com.model;

import java.util.List;

public class Student {
	private int id; 
	private String name; 
	private String rollNumber; 
	private List<Double> listMarks;
	
	/* 2 contructors: No-Arg + with Arg */
	public Student() {
		 
	}

	public Student(int id, String name, String rollNumber) {
		super();
		this.id = id;
		this.name = name;
		this.rollNumber = rollNumber;
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

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public List<Double> getListMarks() {
		return listMarks;
	}

	public void setListMarks(List<Double> listMarks) {
		this.listMarks = listMarks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNumber=" + rollNumber + ", listMarks=" + listMarks + "]";
	}

}
