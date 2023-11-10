package com.controller.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dto.FAQDto;

public class FAQUtility {

	private Map<String,String> map;
	/* 
	 * map is for saving username as key and 
	 * role as value of that key 
	 *  */
	private static FAQUtility utility = new FAQUtility(); //100X
	
	private FAQUtility() {
		map=new HashMap<>();
		map.put("harry", "CUSTOMER");
		map.put("frodo", "EXECUTIVE");
		map.put("bilbo", "ADMIN");
	}
	/* When the object of this class is created, constructor will be called and
	 * HashMap will be populated with values. 
	 * */
	
	public static FAQUtility getInstance(){
		return utility;
	}
	
	public String getRoleByUsername(String username) {
		String role = map.get(username);
		return role; 
	}
	
	public List<FAQDto> getFAQByRole(String role){
		List<FAQDto> listCustomer = new ArrayList<>(); 
		
		String q1="What are the charges for IMPS transaction above INR 2L";
		String a1="The charges are 0.5% of the amount or 200, whatever is highest";
		
		FAQDto dto1 = new FAQDto(); //100X
		dto1.setQuestion(q1);
		dto1.setAnswer(a1);
		listCustomer.add(dto1);
		
		String q2="What are the charges for NEFT transaction above INR 2L";
		String a2="NEFT limit is 2L max";
		FAQDto dto2 = new FAQDto();  //200X
		dto2.setQuestion(q2);
		dto2.setAnswer(a2);
		listCustomer.add(dto2);
		
		List<FAQDto> listExecutive = new ArrayList<>(); 
		String q3="Can I reset the password twice in a day";
		String a3="No, Password reset can be done only once in 24 hours";
		
		FAQDto dto3 = new FAQDto(); //200X
		dto3.setQuestion(q3);
		dto3.setAnswer(a3);
		listExecutive.add(dto3);
		
		List<FAQDto> listAdmin = new ArrayList<>(); 
		String q4="Can the executive username be repeated?";
		String a4="No, Executive username must be unique";
		
		FAQDto dto4 = new FAQDto(); //300X
		dto4.setQuestion(q4);
		dto4.setAnswer(a4);
		listAdmin.add(dto4);
		
		switch(role) {
		case "CUSTOMER": 
			return listCustomer;
			 
		case "EXECUTIVE":
			return listExecutive;
			 
		case "ADMIN":
			return listAdmin;

		default: 
			return null;
			
		}
	}
}

/* Q  Qbj1
 * A
 * 
 * Q  Obj2
 * A
 * 
 * Q
 * A
 * 
 * Q
 * A */
 