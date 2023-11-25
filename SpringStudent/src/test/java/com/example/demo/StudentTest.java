package com.example.demo;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;
import com.example.demo.service.StudentService;

@WebMvcTest(value = StudentService.class)
public class StudentTest {
	@Autowired
	MockMvc mockMvc;
	@MockBean
	StudentService studentService;
	
	@Mock
	private StudentRepository studentRepository;

	@Test
	void testGetByName() {

		
//		 list
		List<Student> list = new ArrayList<>();

		Student student = new Student(25,"tanuja",34333);
		list.add(student);
		when(studentService.findByName("tanuja")).thenReturn(list);
	}
	@Test
	public void testSaveStudents() {
		Student student=new Student(0, null, 0);
		student.setName("rachana");
		student.setAge(23);
		student.setSalary(30000);
		when(studentRepository.save(student)).thenReturn(student);
	}
}
