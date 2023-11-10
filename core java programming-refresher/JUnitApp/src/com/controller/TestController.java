package com.controller;

import com.service.AjayService;
import com.service.NitaService;

public class TestController {
	public static void main(String[] args) {
		AjayService ajayService = new AjayService();
		NitaService nitaService = new NitaService();
		
		ajayService.m1();
		nitaService.m2();
		
	}
}
