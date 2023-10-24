package com.service;

import com.repository.EmployeeRepository;

public class EmployeeService {

	public void dbTest() {
		EmployeeRepository repository = new EmployeeRepository();
		repository.dbConnect();
		repository.dbClose();
	}
}
