package com.auth.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.main.dto.SignUpDto;
import com.auth.main.exception.InvalidCredentialsException;
import com.auth.main.repository.AuthRepository;

@Service
public class AuthService {

	@Autowired
	private AuthRepository authRepository;
	
	public void signUp(SignUpDto dto) {
		authRepository.signUp(dto);	
	}

	public boolean processLogin(String username, String password) 
			throws InvalidCredentialsException {
		
		try {
			int id = authRepository.processLogin(username,password);
			return true;
		}
		catch (Exception e) {
			throw new InvalidCredentialsException("Invalid Credentials");
		}
		
	}

}
