package com.service;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.model.User;

public class UserService {

	private EntityManager entityManager; 
	
	public UserService(EntityManager entityManager) {
		 this.entityManager = entityManager;
	}

	public User insertUser(User user) {
		entityManager.persist(user);
		Query query = entityManager.createNativeQuery("select * from user where username=?",User.class);
		query.setParameter(1, user.getUsername());
		User userObj = (User) query.getSingleResult(); 
		return userObj;
	}

	public boolean login(String username, String password, String role) {
		 String sql="select * from user where username=? AND password=? AND role=?";
		 Query query = entityManager.createNativeQuery(sql, User.class);
		 query.setParameter(1, username);
		 query.setParameter(2, password);
		 query.setParameter(3, role);
		 try {
			 User userObj = (User) query.getSingleResult();
			 return true;
		 }
		 catch(Exception e) {
			 return false; 
		 }
		  
	}

	 

}
