package excercise4;

import java.util.List;

public interface EmployeeService {
	public void add(int id, String dob,String name,double salary);
	
	public List findEmployeeById(int id);
	
	public List getEmployees();
	
	public List getSortedEmployeesById();
	
	public List getSortedEmployeesBySalary();
	
	public List getSortedEmployeesByName();
}
