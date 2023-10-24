package com.controller;

import java.util.Scanner;

import com.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService employeeService = new EmployeeService();
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
				//Insert Employee
				employeeService.dbTest();
				System.out.println("Insert Employee");
				break; 
			case 2: 
				//View all Employees
				System.out.println("View all Employees");
				break;
			case 3: 
				//Delete an Employee
				System.out.println("Delete an Employee");
				break; 
			default: 
				System.out.println("Invalid input, Try again..");
				break; 
			}
		}
		
		
		sc.close();
		
	}
}
