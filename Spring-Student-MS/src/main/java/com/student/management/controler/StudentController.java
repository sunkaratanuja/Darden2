package com.student.management.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.management.Service.StudentService;
import com.student.management.entity.Student;


@Controller
@RequestMapping("/request")
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}   
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{name}")
	public String editStudentForm(@PathVariable String name, Model model) {
		model.addAttribute("student", studentService.getStudentByname( name));
		return "edit_student";
	}
	@PostMapping("/students/{name}")
	public String updateStudent(@PathVariable String name,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentByname(name);
		
		existingStudent.setName(student.getName());
		existingStudent.setAge(student.getAge());
		existingStudent.setSalary(student.getSalary());
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";		
	}
	// handler method to handle delete student request
	
		@GetMapping("/students/{name}")
		public String deleteStudent(@PathVariable String name) {
			studentService.deleteStudentByname(name);
			return "redirect:/students";
		}
		
		
		

}                               
