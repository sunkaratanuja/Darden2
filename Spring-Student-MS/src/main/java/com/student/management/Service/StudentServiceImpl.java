package com.student.management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.management.entity.Student;
import com.student.management.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
@Autowired	
private StudentRepo studentRepository;
	
	public StudentServiceImpl(StudentRepo studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentByname(String name) {
		return studentRepository.findByname(name).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentByname(String name) {
		studentRepository.deleteByname(name);	
	}


}
