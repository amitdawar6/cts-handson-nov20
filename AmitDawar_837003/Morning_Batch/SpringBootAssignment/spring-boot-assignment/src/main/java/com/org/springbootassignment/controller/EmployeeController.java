package com.org.springbootassignment.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.springbootassignment.entity.Employee;

public interface EmployeeController {

	List<Employee> getAllEmploye();

	public ResponseEntity<Object> findEmployee(@PathVariable int id);

	public Employee addEmployee(@RequestBody Employee request);

	public ResponseEntity<Object> updateEmployee(@RequestBody Employee request);

	public ResponseEntity<Object> deleteEmployee(@RequestBody Employee request);

}

