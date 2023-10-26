package com.service;

import javax.persistence.EntityManager;

import com.model.Employee;

public class EmployeeService {

	private EntityManager entityManager;  //instance variable
	
	public EmployeeService(EntityManager entityManager) { //local variable
		this.entityManager = entityManager;
	}

	public void insertEmployee(Employee employee) {
		entityManager.persist(employee);
		
	}

}
