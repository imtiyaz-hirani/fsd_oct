package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.dto.FAQDto;
import com.exception.IllegalMarksException;
import com.service.MyService;

public class MyServiceTest {

	MyService myService = new MyService();

	@Test
	public void computeSumTest() {
		// from here i call my service method
		// myService.computeSum(-5, 10); //5
		// myService.computeSum(-5, -5); //-10

		Assert.assertEquals(15, myService.computeSum(5, 10));
		Assert.assertEquals(5, myService.computeSum(-5, 10));
		Assert.assertEquals(-10, myService.computeSum(-5, -5));
	}

	@Test
	public void computeGradeTest() {
		// from here, i call computeGrade

		/* Prepare the input Set: 1 */
		double[] marks = { 56, 74, 89, 90, 92 };
		double totalMarks = 500;
		try {
			Assert.assertEquals("A", myService.computeGrade(marks, totalMarks));
		} catch (IllegalMarksException e) {

		}
		/* Prepare the input Set: 2 */
		double[] marks2 = { 56, 74, 89, 90, 92, 45, 60 };
		double totalMarks2 = 700;
		try {
			Assert.assertEquals("B", myService.computeGrade(marks2, totalMarks2));
		} catch (IllegalMarksException e) {

		}
		/* Prepare the input Set: 3 */
		double[] marks3 = { 56, 72, 40 };
		double totalMarks3 = 300;
		try {
			Assert.assertEquals("C", myService.computeGrade(marks3, totalMarks3));
		} catch (IllegalMarksException e) {

		}
		
		/* Prepare the input Set: 4 */
		double[] marks4 = { 156, 72, 40 };
		double totalMarks4 = 300;
		try {
			Assert.assertEquals("C", myService.computeGrade(marks4, totalMarks4));
		} catch (IllegalMarksException e) {
			Assert.assertEquals("Marks cannot be more than 100", e.getMessage());
		}
		
		/* Prepare the input Set: 5 */
		double[] marks5 = { 56, 72, -40 };
		double totalMarks5 = 300;
		try {
			Assert.assertEquals("C", myService.computeGrade(marks5, totalMarks5));
		} catch (IllegalMarksException e) {
			Assert.assertEquals("Marks cannot be less than 0", e.getMessage());
		}
	}
	
	@Test
	public void displayFAQTest(){
		String username="harry";
		Assert.assertEquals(2, myService.displayFAQ(username).size());
		
		username="frodo";
		Assert.assertEquals(1, myService.displayFAQ(username).size());
		
		username="bilbo";
		Assert.assertEquals(1, myService.displayFAQ(username).size());
		
		/* To check the content of the List prepare the expected list */
		List<FAQDto> listAdmin = new ArrayList<>(); 
		String q4="Can the executive username be repeated?";
		String a4="No, Executive username must be unique";
		
		FAQDto dto4 = new FAQDto(); //300X
		dto4.setQuestion(q4);
		dto4.setAnswer(a4);
		listAdmin.add(dto4);
		Assert.assertEquals(listAdmin, myService.displayFAQ(username));
	}
	
	
}














