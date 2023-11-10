package com.service;

import com.controller.utility.TestUtility;

public class NitaService {

	public void m2() {
		TestUtility utility =   TestUtility.getInstance(); //200X
		System.out.println(utility);
		utility.display();
	}
}
