package com.auth.main.exception;

public class InvalidCredentialsException extends Exception{

	private static final long serialVersionUID = 7408147587598913853L;

	private String message;

	public InvalidCredentialsException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	} 
	
	
}
