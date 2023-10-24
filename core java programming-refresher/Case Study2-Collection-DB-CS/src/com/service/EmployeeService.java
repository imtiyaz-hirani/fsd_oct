package com.service;

import java.util.List;
import java.util.stream.Collectors;

import com.exception.InvalidIdException;
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
		List<Employee> list 
		        = repository.getAllEmployee();
		return list;
	}

	public void deleteEmployee(int id) {
		repository.deleteEmployee(id);
		
	}

	public void validateId(int id) throws InvalidIdException{
		List<Employee> list 
        = repository.getAllEmployee();
		
		List<Integer> idList=  list.stream()
									.map(e->e.getId())
									.collect(Collectors.toList());
		if(idList.contains(id) == false)
			throw new InvalidIdException("ID invalid, please try again");
	}
}
