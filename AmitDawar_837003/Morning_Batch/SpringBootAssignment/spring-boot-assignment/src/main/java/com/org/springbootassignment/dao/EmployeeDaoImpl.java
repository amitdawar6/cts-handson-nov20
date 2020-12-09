package com.org.springbootassignment.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.springbootassignment.entity.Employee;
import com.org.springbootassignment.entity.EmployeeRepository;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> displayAll() {

		return repository.findAll();
	}

	@Override
	public Optional<Employee> findEmployee(int id) {

		return repository.findById(id);
	}

	@Override
	public Employee addEmployee(Integer id, String name, Double salary) {

		Employee pojo = new Employee(id, name, salary);

		return repository.save(pojo);

	}

	@Override
	public Employee updateEmployee(Integer id, String name, Double salary) {

		Employee emp = new Employee(id, name, salary);

		return repository.save(emp);

	}

	@Override
	public void deleteEmployee(Integer id) {
		repository.deleteById(id);

	}

}

