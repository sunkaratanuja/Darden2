package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class Test1 {
	@Test
	void testStudentDetails() {
	        Student1 student = new Student1();
	        student.setName("Deepika");
	        student.setAge(23);
	        student.setSalary(28000.0);
	 
	        assertEquals("Deepika", student.getName());
	        assertEquals(23, student.getAge());
	        assertEquals(28000.0, student.getSalary(), 0.001);
	    }
}
