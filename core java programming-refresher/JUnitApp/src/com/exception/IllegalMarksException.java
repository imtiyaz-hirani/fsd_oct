package com.exception;

public class IllegalMarksException extends Exception{ //custom checked exception

	private static final long serialVersionUID = 3238142874638602413L;

	private String message;

	public IllegalMarksException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
}
