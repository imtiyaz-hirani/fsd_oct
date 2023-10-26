package com.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.exception.InvalidIdException;
import com.model.Employee;
import com.model.Manager;
import com.service.EmployeeService;
import com.service.ManagerService;

public class EmployeeController {
	public static void main(String[] args) {
		/* Step 1: reach out to persistence unit */
		EntityManagerFactory entityManagerFactory 
			=  Persistence.createEntityManagerFactory("mydbunit");
 		
		/* Step 2: Using EntityManagerFactory create EntityManager ref */
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		/* Step 3: Using EntityManager, create reference of EntityTransaction */
		EntityTransaction entityTransaction= entityManager.getTransaction();
		Scanner sc = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeService(entityManager);
		ManagerService managerService = new ManagerService(entityManager);
		Manager manager=null;
		
		while(true) {
			System.out.println("******Employee Reward System********");
			System.out.println("1. Insert Manager");
			System.out.println("2. Insert Employee");
			System.out.println("3. Show all Employees");
			System.out.println("0. Exit");
			System.out.println("*************************************");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting.. thank you");
				break; //break the while loop
			}
			 entityTransaction.begin();
			switch(input) {
			case 1:
				 System.out.println("Enter name");
				 String name = sc.next();
				 System.out.println("Enter Emp. Code");
				 String empCode = sc.next();
				 manager  =new Manager();
				 manager.setName(name);
				 manager.setEmpCode(empCode);
				 managerService.insertManager(manager); 
				 System.out.println("Manager Inserted in DB..");
				break;
			case 2:
				Employee employee = new Employee(); 
				System.out.println("enter employee name");
				employee.setName(sc.next());
				System.out.println("Enter employee code");
				employee.setEmpCode(sc.next());
				System.out.println("Enter emp salary");
				employee.setSalary(sc.nextDouble());
				employee.setWalletBalance(0.0);
				
				System.out.println("Enter Manager ID");
				try {
					Manager managerObj = managerService.getManagerById(sc.nextInt());
					employee.setManager(managerObj);
					employeeService.insertEmployee(employee);
					System.out.println("Employee inserted in DB...");
				} catch (InvalidIdException e) {
					 System.out.println(e.getMessage());
				}
				break;
			case 3: 
				break;
			default: 
				System.out.println("Invalid input given, try again!!");		
			}
			entityTransaction.commit();
		}
	}
}

//ctrl + shft + O
