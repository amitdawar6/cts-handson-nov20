package com.org.springbootassignment.service;

import java.util.List;
import java.util.Optional;

import com.org.springbootassignment.entity.Employee;
import com.org.springbootassignment.exception.EmployeeNotFoundException;

public interface EmployeeService {

	List<Employee> displayAll();

	public Optional<Employee> findEmployee(int id) throws EmployeeNotFoundException;

	public Employee addEmployee(Integer id, String name, Double salary) throws RuntimeException;

	public Employee updateEmployee(Integer id, Double salary) throws EmployeeNotFoundException ;

	public Employee deleteEmployee(Integer id) throws  EmployeeNotFoundException;
	
	
}

