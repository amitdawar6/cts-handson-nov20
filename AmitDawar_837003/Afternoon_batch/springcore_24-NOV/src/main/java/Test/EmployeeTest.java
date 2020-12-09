package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeService service = (EmployeeService) context.getBean("service");
		
		service.storeEmployee();
	}

}
