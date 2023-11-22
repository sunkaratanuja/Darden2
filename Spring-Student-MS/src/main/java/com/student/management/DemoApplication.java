package com.student.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.management.entity.Student;
import com.student.management.repo.StudentRepo;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Autowired	
	private StudentRepo studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		
		
	}

}
