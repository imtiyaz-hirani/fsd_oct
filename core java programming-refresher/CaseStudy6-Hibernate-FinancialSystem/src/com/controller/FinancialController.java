package com.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.enums.Role;
import com.exception.UserNotFoundException;
import com.model.Executive;
import com.model.FundCompany;
import com.model.User;
import com.service.ExecutiveService;
import com.service.FundCompanyService;
import com.service.UserService;

public class FinancialController {
	public static void main(String[] args) {
		/* Step 1: reach out to persistence unit */
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mydbunit");

		/* Step 2: Using EntityManagerFactory create EntityManager ref */
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		/* Step 3: Using EntityManager, create reference of EntityTransaction */
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Scanner sc = new Scanner(System.in);
		UserService userService = new UserService(entityManager);
		ExecutiveService executiveService = new ExecutiveService(entityManager);
		FundCompanyService fundCompanyService = new FundCompanyService(entityManager);
		System.out.println("*********LOGIN**********");
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		entityTransaction.begin();
		if (username.equals("HR") && password.equals("hr")) {
			while (true) {
				System.out.println("1. Onboard Executives");
				System.out.println("2. Logout");
				int input = sc.nextInt();
				if (input == 2) {
					System.out.println("Logging out.. Thanx");
					break;
				}
				Executive executive = new Executive();
				System.out.println("Enter name");
				executive.setName(sc.next());
				System.out.println("Enter email");
				executive.setEmail(sc.next());

				User user = new User();
				System.out.println("Enter username");
				user.setUsername(sc.next());
				System.out.println("Enter password");
				user.setPassword(sc.next());
				user.setRole(Role.EXECUTIVE);

				User userObj = userService.insertUser(user);
				executive.setUser(userObj);

				executiveService.insertExecutive(executive);
				System.out.println("Executive added to the system..");
				entityTransaction.commit();
			}
		} else if (username.equals("SALES") && password.equals("sales")) {

			while (true) {
				System.out.println("1. Onboard Fund Companies");
				System.out.println("2. Logout");
				int input = sc.nextInt();
				if (input == 2) {
					System.out.println("Logging out.. Thanx");
					break;
				}
				FundCompany fundCompany = new FundCompany();
				System.out.println("Enter name");
				fundCompany.setName(sc.next());
				System.out.println("Enter email");
				fundCompany.setEmail(sc.next());

				User user = new User();
				System.out.println("Enter username");
				user.setUsername(sc.next());
				System.out.println("Enter password");
				user.setPassword(sc.next());
				user.setRole(Role.FUND_COMPANY);

				User userObj = userService.insertUser(user);
				fundCompany.setUser(userObj);

				fundCompanyService.insertCompany(fundCompany);
				System.out.println("Fund Company added to the system..");
				entityTransaction.commit();
			}
		} 
		else {
			 try {
				User user = userService.login(username,password);
				if(user.getRole().equals(Role.EXECUTIVE)) {
					System.out.println("Welcome Executive :" + user.getUsername());
					//menu from executive 
				}
				else
				if(user.getRole().equals(Role.FUND_COMPANY)){
					System.out.println("Welcome company :" + user.getUsername());
					//menu from company
				}
				
			} catch (UserNotFoundException e) {
				 System.out.println(e.getMessage());
			}
		}

	}
}
