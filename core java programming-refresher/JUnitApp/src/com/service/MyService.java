package com.service;

import java.util.List;

import com.controller.utility.FAQUtility;
import com.dto.FAQDto;
import com.exception.IllegalMarksException;

public class MyService {

	public int computeSum(int n1,int n2) {
		int sum = n1+n2;
		return sum;
	}
	
	public String computeGrade(double[] marks,
			double totalMarks) throws IllegalMarksException {
		/* If any individual marks>100, throw exception. 
		 * Id any individual marks<0, throw exception. 
		 * */
		
		double sumMarks=0;
		for(double m : marks) {
			if(m>100)
				throw new IllegalMarksException("Marks cannot be more than 100");
			if(m<0)
				throw new IllegalMarksException("Marks cannot be less than 0");
			sumMarks = sumMarks + m; 
		}
		
		double percent = (sumMarks / totalMarks) *100;
		
		if(percent > 75)
			return "A";
		if(percent>60)
			return "B";
		return "C";
	}
	
	public List<FAQDto> displayFAQ(String username){
		FAQUtility utility = new FAQUtility();
		String role = utility.getRoleByUsername(username);
		return utility.getFAQByRole(role);
	}
}






















 