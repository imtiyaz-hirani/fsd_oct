package com.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.User;

public class UserService {
	
private EntityManager entityManager; 
	
	public UserService(EntityManager entityManager) {
		 this.entityManager = entityManager;
	}
	
	public User insertUser(User user) {
		entityManager.persist(user);
		Query query = entityManager.createNativeQuery("select * from user_info where username=?",User.class);
		query.setParameter(1, user.getUsername());
		User userObj = (User) query.getSingleResult(); 
		return userObj;
	}
}
