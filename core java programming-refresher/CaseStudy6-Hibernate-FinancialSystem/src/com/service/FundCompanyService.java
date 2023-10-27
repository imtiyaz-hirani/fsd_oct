package com.service;

import javax.persistence.EntityManager;

import com.model.FundCompany;

public class FundCompanyService {

	private EntityManager entityManager;

	public FundCompanyService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void insertCompany(FundCompany fundCompany) {
		entityManager.persist(fundCompany);
		
	}

}
