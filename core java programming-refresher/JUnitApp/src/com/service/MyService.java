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
		FAQUtility faqUtility= FAQUtility.getInstance();
		String role = faqUtility.getRoleByUsername(username);
		return faqUtility.getFAQByRole(role);
	}
}

/* 
 * Reference: FAQUtility utility
 * Object: new FAQUtility();
 * 
 * References go on stack. 
 * Objects are saved in the Heap 
 * 
 * STACK						HEAP          [RAM:64mb]	-- GC: Garbage Collector 
 * 						100X:
 * 						200X:
 * 						300X: 
 * */

//6 AM: GC Truck : collects 

//come in: System.gc() - clean the garbage 

//garbage? : garbage are those objects that are inactive. not pointed to from the stack. 


















 