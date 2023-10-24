package com.controller;

import java.util.List;
import java.util.Scanner;

import com.exception.InvalidIdException;
import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeService();
		Employee employee = new Employee(); 
		
		while(true) {
			System.out.println("*******Employee Ops**********");
			System.out.println("1. Insert Employee");
			System.out.println("2. View all Employees");
			System.out.println("3. Delete an Employee");
			System.out.println("0. Exit");
			System.out.println("******************************");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting the menu...");
				break; //exit while loop 
			}
			
			switch(input) {
			case 1: 
				//Insert Employee: Take input from user.
				System.out.println("Enter employee name");
				employee.setName(sc.next());
				System.out.println("Enter employee department");
				employee.setDepartment(sc.next());
				System.out.println("Enter employee salary");
				employee.setSalary(sc.nextDouble());
				/* Pass this employee to Service */
				employeeService.insertEmployee(employee);
				System.out.println("Employee record inserted..");
				break; 
			case 2: 
				//View all Employees
				System.out.println("View all Employees");
				List<Employee> list= employeeService.getAllEmployee();
				for( Employee e: list) {
					System.out.println(e);
				}
				break;
			case 3: 
				//Delete an Employee
				System.out.println("Enter ID to delete record");
				int id = sc.nextInt();
				try {
					employeeService.validateId(id);
					employeeService.deleteEmployee(id);
					System.out.println("Your record is deleted..");
				} catch (InvalidIdException e1) {
					 System.out.println(e1.getMessage());
				}
				break; 
			default: 
				System.out.println("Invalid input, Try again..");
				break; 
			}
		}
		
		
		sc.close();
		
	}
}
