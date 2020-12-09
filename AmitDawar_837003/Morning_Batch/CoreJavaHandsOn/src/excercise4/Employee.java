package excercise4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
	private int id;
	private LocalDate dob;
	private String name;
	private double Salary;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, LocalDate dob, String name, double salary) {
		super();
		this.id = id;
		this.dob = dob;
		this.name = name;
		Salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", dob=" + dob + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	

}
