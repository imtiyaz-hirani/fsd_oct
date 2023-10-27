package com.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.exception.UserNotFoundException;
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

	public User login(String username, String password) throws UserNotFoundException{
		String sql="select * from user_info where username=? AND password=?";
		 Query query = entityManager.createNativeQuery(sql, User.class);
		 query.setParameter(1, username);
		 query.setParameter(2, password);
		 
		 try {
			 User userObj = (User) query.getSingleResult();
			 return userObj;
		 }
		 catch(Exception e) {
			 throw new UserNotFoundException("Invalid Credentials");
		 }
	}
}
