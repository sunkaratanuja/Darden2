package com.doselect.common;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doselct.repository.CustomerRepository;
import com.doselect.model.Customer;

import jakarta.persistence.Entity;

@SpringBootApplication
	public class App {

	    public static void main(String[] args) {
	        SpringApplication.run(App.class, args);
	    }

	    @RestController
	    @RequestMapping("/customer")
	    public static class CustomerController {

	        @Autowired
	        private CustomerRepository customerRepository;

	        @PostMapping("/insert")
	        public void insert(@RequestParam int id, @RequestParam String name, @RequestParam int age) {
	            Customer customer = new Customer(id, name, age);
	            customerRepository.save(customer);
	        }

	        @GetMapping("/fetch/{id}")
	        public String fetch(@PathVariable int id) {
	            Customer customer = customerRepository.findById(id).orElse(null);
	            if (customer != null) {
	                return "Customer [age=" + customer.getAge() + " custId=" + customer.getId() + ", name=" + customer.getName() + "]";
	            } else {
	                return "Customer not found";
	            }
	           
	        }
	    }

	    
	    

	    
	    }
	

