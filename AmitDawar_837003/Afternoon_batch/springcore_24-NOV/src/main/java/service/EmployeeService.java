package service;

import dao.EmployeeDAO;

public class EmployeeService  {
	private EmployeeDAO empDao;
	
	
	public EmployeeDAO getEmpDao() {
		return empDao;
	}


	public void setEmpDao(EmployeeDAO empDao) {
		this.empDao = empDao;
	}


	public void storeEmployee() {
		System.out.println("EmployeeService storeEmployee");
		empDao.store();
	}


	
}
