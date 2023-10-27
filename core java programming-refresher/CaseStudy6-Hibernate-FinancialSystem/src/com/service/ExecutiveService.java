package com.service;

import javax.persistence.EntityManager;

import com.model.Executive;

public class ExecutiveService {

	private EntityManager entityManager;

	public ExecutiveService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void insertExecutive(Executive executive) {
		entityManager.persist(executive);

	}
}
