package com.springboot.main.jira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.jira.model.Employee;
import com.springboot.main.jira.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")  //--> /employee/add
	public Employee insertEmployee(@RequestBody Employee employee) {
		return employeeService.insert(employee);
	}
}
