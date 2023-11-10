package com.service;

import com.controller.utility.TestUtility;

public class AjayService {

	public void m1() {
		TestUtility utility =  TestUtility.getInstance(); //100X
		System.out.println(utility);
		utility.display();
	}
}
