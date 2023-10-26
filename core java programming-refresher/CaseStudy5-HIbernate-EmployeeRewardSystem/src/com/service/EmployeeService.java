package com.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Employee;

public class EmployeeService {

	private EntityManager entityManager;  //instance variable
	
	public EmployeeService(EntityManager entityManager) { //local variable
		this.entityManager = entityManager;
	}

	public void insertEmployee(Employee employee) {
		entityManager.persist(employee);
		
	}

	public List<Employee> getAllEmployee() {
		Query query = entityManager.createNativeQuery("select * from employee", Employee.class);
		return query.getResultList();
	}

}





