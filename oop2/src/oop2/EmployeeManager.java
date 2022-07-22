package oop2;

import java.util.List;

public class EmployeeManager {
	private List<Logger> loggers;

	public EmployeeManager(List<Logger> loggers) {
		super();
		this.loggers = loggers;

	}

	public void add(Employee employee) {
		for (Logger logger : getAll()) {
			logger.log(employee.getFirstName());
		}
	}

	public List<Logger> getAll() {
		return loggers;
	}
}
//coklu loglama getir
