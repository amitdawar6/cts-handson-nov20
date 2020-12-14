package com.org.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.Customer;
import com.org.service.CustomerService;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	CustomerService service;
	
	@PostMapping
	public Customer createCustomerAPI(@RequestBody Customer customer) {
		 Customer addCustomer = service.addCustomer(customer);
		 return addCustomer;
	}
	@GetMapping("{customerId}")
	public Customer getCustomer(@PathVariable("customerId") int id) {
		return service.fetchCustomer(id);
	}
	@PutMapping("{customerId}/{dob}")
	public Customer updateCustomerDobAPI(@PathVariable("customerId") int id,@PathVariable("dob") String stringdob) {
		return service.updateCustomer(id, LocalDate.parse(stringdob));
	}
	@DeleteMapping("{customerId}")
	public void deleteCustomerbyId(@PathVariable("customerId") int id) {
		service.deleteCustomer(id);
	}
	
}
	


