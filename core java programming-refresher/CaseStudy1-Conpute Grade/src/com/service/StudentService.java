package com.service;

import java.util.List;

import com.exception.InvalidMarksException;
import com.model.Student;

public class StudentService {

	public String computeGrade(Student student) throws InvalidMarksException{
		/* Computing total marks from given marks in list */
		List<Double> list = student.getListMarks(); 
		double totalMarks = 0.0; 
		
		/* Validate input */
		for(double marks : list) {
			if(marks > 100)
				throw new InvalidMarksException("Invalid Marks : cannot be more than 100");
			if(marks <0)
				throw new InvalidMarksException("Invalid Marks : cannot be less than 0");
			totalMarks = totalMarks + marks; 
		}
		
		/* computing percentage */
		double percent = (totalMarks * 100) / 500;  
		
		/* Computing Grade */
		if(percent > 75)
			return "A";
		if(percent > 60)
			return "B";
		if(percent>45)
			return "C";
		
		return "D";
	}
 
}
