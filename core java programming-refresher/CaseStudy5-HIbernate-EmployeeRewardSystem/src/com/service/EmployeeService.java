package com.service;

import javax.persistence.EntityManager;

public class EmployeeService {

	private EntityManager entityManager;  //instance variable
	
	public EmployeeService(EntityManager entityManager) { //local variable
		this.entityManager = entityManager;
	}

}
