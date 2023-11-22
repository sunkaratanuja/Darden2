package com.student.management.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.management.entity.Student;

@Repository            

public interface StudentRepo extends MongoRepository<Student, String>{

	void deleteByname(String name);

	Object findByname(String name);
	                                           
}         
                                                                   
                                                                                                                                                                                                                                  