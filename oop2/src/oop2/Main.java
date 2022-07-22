package oop2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "recep", "bayindir", "12345566777");

		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add(customer);

		Employee employee1 = new Employee(1, "seher", "yalcin", "12312312313", 3000);
		
		List<Logger> loggers= new ArrayList<>();
		loggers.add(new DatabaseLogger());
		loggers.add(new CloudLogger());
		loggers.add(new FileLogger());
		
		
		EmployeeManager employeeManager=new EmployeeManager(loggers);
		employeeManager.add(employee1);
	}

}
