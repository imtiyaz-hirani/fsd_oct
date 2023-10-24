package com.exception;

/* Self defined: custom */
public class InvalidMarksException extends Exception{
	 
	private static final long serialVersionUID = -5650512882823109995L;
	
	private String message;

	public InvalidMarksException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	} 

}
/* 
 * Like Other exception classes, pls consider 
 * InvalidMarksException as a checked exception. 
 * 
 * constructors are used to initilize instance variables. 
 */