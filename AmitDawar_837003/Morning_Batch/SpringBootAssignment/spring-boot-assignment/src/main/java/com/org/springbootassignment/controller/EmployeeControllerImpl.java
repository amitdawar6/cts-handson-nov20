package com.org.springbootassignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.springbootassignment.entity.Employee;
import com.org.springbootassignment.exception.EmployeeNotFoundException;
import com.org.springbootassignment.exception.ExceptionResponse;
import com.org.springbootassignment.service.EmployeeService;

@RestController
public class EmployeeControllerImpl implements EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping(value = "/getAllEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmploye() {

		return service.displayAll();

	}

	@GetMapping(value = "/findEmployee/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findEmployee(@PathVariable int id) {
		ResponseEntity<Object> empResponse = null;

		Optional<Employee> employee = null;
		try {

			employee = service.findEmployee(id);
			empResponse = ResponseEntity.status(200).body(employee);

		} catch (EmployeeNotFoundException e) {
			ExceptionResponse eR = new ExceptionResponse();
			eR.setStatusCode(404);
			eR.setExceptionMessage(e.getMessage());
			// System.out.println("Exception Code : "+eR.getStatusCode()+" Exception : "+
			// eR.getExceptionMessage());
			empResponse = ResponseEntity.status(eR.getStatusCode()).body(eR);
		}

		return empResponse;

	}

	@PostMapping(value = "/addEmployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(@RequestBody Employee request) {
		int i = (int) (Math.random() * 420);
		request.setId(i);

		Employee employee = service.addEmployee(request.getId(), request.getName(), request.getSalary());

		return employee;

	}

	// to change/update use put mapping.
	@PutMapping(value = "/updateEmployee", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee request) {

		ResponseEntity<Object> empResponse = null;

		Employee employee = null;
		try {
			employee = service.updateEmployee(request.getId(), request.getSalary());
			String msg = "successfully updated";
			empResponse = ResponseEntity.status(200).body(msg);

		} catch (EmployeeNotFoundException e) {
			ExceptionResponse eR = new ExceptionResponse();
			eR.setStatusCode(404);
			eR.setExceptionMessage(e.getMessage());
			empResponse = ResponseEntity.status(eR.getStatusCode()).body(eR);
		}

		return empResponse;

	}

	@DeleteMapping(value = "/deleteEmployee", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteEmployee(@RequestBody Employee request) {

		ResponseEntity<Object> empResponse = null;

		Employee employee = null;
		try {
			employee = service.deleteEmployee(request.getId());
			;
			String msg = "successfully deleted";
			empResponse = ResponseEntity.status(200).body(msg);

		} catch (EmployeeNotFoundException e) {
			ExceptionResponse eR = new ExceptionResponse();
			eR.setStatusCode(404);
			eR.setExceptionMessage(e.getMessage());
			empResponse = ResponseEntity.status(eR.getStatusCode()).body(eR);
		}

		return empResponse;

	}

}
