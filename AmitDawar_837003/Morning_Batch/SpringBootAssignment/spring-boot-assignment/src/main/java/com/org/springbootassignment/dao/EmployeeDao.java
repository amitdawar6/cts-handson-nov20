package com.org.springbootassignment.dao;

import java.util.List;
import java.util.Optional;

import com.org.springbootassignment.entity.Employee;

public interface EmployeeDao {

	List<Employee> displayAll();

	public Optional<Employee> findEmployee(int id);

	public Employee addEmployee(Integer id, String name, Double salary);

	public Employee updateEmployee(Integer id, String name, Double salary);

	public void deleteEmployee(Integer id);
	
	
}
