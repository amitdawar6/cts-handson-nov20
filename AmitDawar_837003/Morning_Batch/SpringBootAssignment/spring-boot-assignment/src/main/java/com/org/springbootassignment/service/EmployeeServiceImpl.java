package com.org.springbootassignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.springbootassignment.dao.EmployeeDao;
import com.org.springbootassignment.entity.Employee;
import com.org.springbootassignment.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	public List<Employee> displayAll() {
		return dao.displayAll();
	}

	@Override
	public Optional<Employee> findEmployee(int id) throws EmployeeNotFoundException {

		if (dao.findEmployee(id).isEmpty())
			throw new EmployeeNotFoundException("Employee Does Not Exist");

		return dao.findEmployee(id);

	}

	@Override
	public Employee addEmployee(Integer id, String name, Double salary) {

		Employee employee = dao.addEmployee(id, name, salary);
		return employee;

	}

	@Override
	public Employee updateEmployee(Integer id, Double salary) throws EmployeeNotFoundException {

		Optional<Employee> employee = findEmployee(id);

		Employee employeeUpdate = dao.updateEmployee(id, employee.get().getName(), salary);
		return employeeUpdate;

	}

	@Override
	public Employee deleteEmployee(Integer id) throws EmployeeNotFoundException {

		Optional<Employee> employeeCheck = findEmployee(id);

		dao.deleteEmployee(id);
		return null;

	}

}

