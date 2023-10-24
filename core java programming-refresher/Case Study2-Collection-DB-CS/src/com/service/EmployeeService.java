package com.service;

import java.util.List;

import com.model.Employee;
import com.repository.EmployeeRepository;

public class EmployeeService {
	EmployeeRepository repository = new EmployeeRepository();
	
	public void dbTest() {
		repository.dbConnect();
		repository.dbClose();
	}

	public void insertEmployee(Employee employee) {
		repository.insertEmployee(employee); 
	}

	public List<Employee> getAllEmployee() {
		List<Employee> list = repository.getAllEmployee();
		return list;
	}
}
