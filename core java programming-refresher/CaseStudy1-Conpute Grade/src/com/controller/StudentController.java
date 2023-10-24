package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.exception.InvalidMarksException;
import com.model.Student;
import com.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student(); 
		StudentService studentService = new StudentService();
		List<Double> marksList = new ArrayList<>();
		
		/* Take basic info from the user */
		System.out.println("Enter roll number");
		String rollNumber = sc.next();
		
		System.out.println("Enter your name pls");
		String name=sc.next();
		//resume at 11.15AM
		/* Take marks scored in subjects(5) */
		int numberOfStudents=5; 
		for( int i=0;i<numberOfStudents;i++) {
			System.out.println("Enter Marks of Subject " + (i+1));
			marksList.add(sc.nextDouble());	
		}
		
		/* Attach all inputs to student object */
		student.setRollNumber(rollNumber);
		student.setName(name);
		student.setListMarks(marksList);
		student.setId(1);
		
		//System.out.println(student);//Student [id=1, name=imtiyaz, rollNumber=15, listMarks=[87.0, 98.0, 86.0, 76.0, 60.0]]
		
		/* Give this info to Service layer and take the grade */
		try {
			String grade = studentService.computeGrade(student);
			/* Display the grade */
			System.out.println("Your Grade is " + grade);
		}
		catch(InvalidMarksException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}
}
