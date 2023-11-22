package com.student.management.Service;

import java.util.List;

import com.student.management.entity.Student;


public interface StudentService {
	Object existingStudent = null;

	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentByname(String name);
	
	Student updateStudent(Student student);
	
	void deleteStudentByname(String name);
	
}      