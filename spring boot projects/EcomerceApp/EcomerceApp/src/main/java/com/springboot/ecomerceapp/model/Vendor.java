package com.springboot.ecomerceapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//JPA: Java Persistence API 

@Entity //<-- please create a table for me in the DB 
public class Vendor { //<-- tablename: vendor
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	
	@Column(nullable = false)
	private String name; 
	
	@Column(nullable = false)
	private String city;
	 
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	} 
	
	

}
