package com.exception;

public class InvalidIdException extends Exception{
 
	private static final long serialVersionUID = -7139829922127389433L;
	
	private String message; 
	
	public InvalidIdException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
}
