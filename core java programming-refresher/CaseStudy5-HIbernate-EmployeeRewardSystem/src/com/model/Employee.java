package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity  //<-- this will create table employee in the DB 
public class Employee {
	@Id //<-- pls make id as primary key 
	@GeneratedValue(strategy = GenerationType.AUTO) //<-- this will make id auto_increment
	private int id;
	private String name;
	private String empCode;
	private double salary;
	private double walletBalance;
	
	@ManyToOne
	private Manager manager; //injecting Manager in employee  
	
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

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", empCode=" + empCode + ", salary=" + salary
				+ ", walletBalance=" + walletBalance + ", manager=" + manager + "]";
	}

	
}
