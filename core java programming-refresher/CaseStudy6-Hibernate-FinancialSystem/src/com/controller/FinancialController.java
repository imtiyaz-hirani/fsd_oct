package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FinancialController {
	public static void main(String[] args) {
		/* Step 1: reach out to persistence unit */
		EntityManagerFactory entityManagerFactory 
			=  Persistence.createEntityManagerFactory("mydbunit");
 		
		/* Step 2: Using EntityManagerFactory create EntityManager ref */
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		/* Step 3: Using EntityManager, create reference of EntityTransaction */
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		System.out.println("Works");
	}
}
