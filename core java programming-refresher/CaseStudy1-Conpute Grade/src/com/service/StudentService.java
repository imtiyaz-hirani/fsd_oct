package com.service;

import java.util.List;

import com.model.Student;

public class StudentService {

	public String computeGrade(Student student) {
		/* Computing total marks from given marks in list */
		List<Double> list = student.getListMarks(); 
		double totalMarks = 0.0; 
		for(double marks : list) {
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
