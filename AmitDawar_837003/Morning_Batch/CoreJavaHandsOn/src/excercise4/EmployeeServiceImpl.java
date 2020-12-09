package excercise4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

	List<Employee> list = new ArrayList<>();
	
	@Override
	public void add(int id, String dob, String name, double salary) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date= LocalDate.parse(dob, formatter);
		list.add(new Employee(id,date,name,salary));
		
	}

	@Override
	public List findEmployeeById(int id) {
		List<Employee> idList = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				idList.add(list.get(i));
			}

		}
		return idList;
	}

	@Override
	public List getEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public List getSortedEmployeesById() {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o2.getId()-o1.getId();
			}
			
		});
		return list;
	}

	@Override
	public List getSortedEmployeesBySalary() {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return Double.compare(o2.getSalary(),o1.getSalary());
			}
			
		});		
		return list;
	}

	@Override
	public List getSortedEmployeesByName() {
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		});		
		return list;
	}
	
}
