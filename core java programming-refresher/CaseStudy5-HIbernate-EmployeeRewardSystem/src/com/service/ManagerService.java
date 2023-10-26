package com.service;

import javax.persistence.EntityManager;

import com.exception.InvalidIdException;
import com.model.Manager;

public class ManagerService {

	private EntityManager entityManager; //instance variable
	
	public ManagerService(EntityManager entityManager) { //local entityManager
		this.entityManager = entityManager; //instance = local 
	}

	public void insertManager(Manager manager) {
		entityManager.persist(manager);
		
	}

	public Manager getManagerById(int managerID) throws InvalidIdException{
		Manager manager = entityManager.find(Manager.class, managerID);
		if(manager == null)
			throw new InvalidIdException("Manager Id given is Invalid, try again!!");
		return manager;
	}

}
