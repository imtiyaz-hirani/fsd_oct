package com.controller.utility;

public class TestUtility { //frodo 

	private static TestUtility utility = new TestUtility();
	
	private TestUtility(){
		
	}
	public void display() {
		System.out.println("utility test");
	}
	
	public static TestUtility getInstance(){
		return utility;
	}
}
