package com.service;

import javax.persistence.EntityManager;

import com.model.Manager;

public class ManagerService {

	private EntityManager entityManager; //instance variable
	
	public ManagerService(EntityManager entityManager) { //local entityManager
		this.entityManager = entityManager; //instance = local 
	}

	public void insertManager(Manager manager) {
		entityManager.persist(manager);
		
	}

}
