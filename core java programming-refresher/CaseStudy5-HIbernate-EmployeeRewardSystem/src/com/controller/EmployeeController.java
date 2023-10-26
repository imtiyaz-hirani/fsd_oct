package com.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.exception.InvalidIdException;
import com.model.Employee;
import com.model.Manager;
import com.model.User;
import com.service.EmployeeService;
import com.service.ManagerService;
import com.service.UserService;

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
		UserService userService = new UserService(entityManager);
		Manager manager=null;
		
		while(true) {
			System.out.println("******Employee Reward System********");
			System.out.println("1. Insert Manager");
			System.out.println("2. Insert Employee");
			System.out.println("3. Show all Employees");
			System.out.println("4. Manager Login");
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
				//read manager info and attach to object
				 System.out.println("Enter name");
				 String name = sc.next();
				 System.out.println("Enter Emp. Code");
				 String empCode = sc.next();
				 manager  =new Manager();
				 manager.setName(name);
				 manager.setEmpCode(empCode);
				 
				 //read manager credentials and attach it to User class and manager class 
				 System.out.println("Set your username");
				 String username=sc.next();
				 System.out.println("Create a password");
				 String password = sc.next();
				 System.out.println("Confirm your password");
				 String repassword = sc.next();
				 
				 if(!(password.equals(repassword))) {
					 System.out.println("Passwords do not match, try again!!");
					 break; //come out of this case
				 }
				 User user = new User();
				 user.setUsername(username);
				 user.setPassword(password);
				 user.setRole("MANAGER");
				 //save the user  
				 user = userService.insertUser(user);
				 manager.setUser(user);
				 
				 //insert manager
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
				
				//read employee credentials and attach it to User class and employee class 
				 System.out.println("Set your username");
				 username=sc.next();
				 System.out.println("Create a password");
				 password = sc.next();
				 System.out.println("Confirm your password");
				 repassword = sc.next();
				 
				 if(!(password.equals(repassword))) {
					 System.out.println("Passwords do not match, try again!!");
					 break; //come out of this case
				 }
				 user = new User();
				 user.setUsername(username);
				 user.setPassword(password);
				 user.setRole("EMPLOYEE");
				 //save the user  
				 user = userService.insertUser(user);
				 employee.setUser(user);
				 
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
				List<Employee> list = employeeService.getAllEmployee();
				list.stream().forEach(e->System.out.println(e));
				break;
			default: 
				System.out.println("Invalid input given, try again!!");		
			}
			entityTransaction.commit();
		}
	}
}

//ctrl + shft + O
