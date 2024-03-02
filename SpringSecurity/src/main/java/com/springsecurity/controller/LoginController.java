package com.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.entity.Customer;
import com.springsecurity.repository.CustomerRepository;

@RestController
public class LoginController {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	public LoginController(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody Customer customer){
		Customer savedCustomer =  null;
		ResponseEntity response = null;
		try {
			customer.setPassword(passwordEncoder.encode(customer.getPassword()));
			System.out.println(customer);
			savedCustomer = customerRepository.save(customer);
			if(savedCustomer.getId()>0) {
				response = ResponseEntity.status(HttpStatus.CREATED).body("User is successfully registered");
			}
		}
		catch (Exception e){
			response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An Exception occured due to " +e.getMessage());
		}
		
		return response;
	}
	
}
