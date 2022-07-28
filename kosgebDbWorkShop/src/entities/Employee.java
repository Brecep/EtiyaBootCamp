package entities;

public class Employee extends User {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String registrationNumber;

	public Employee() {
		super();
		
	}

	public Employee(int id, String userName, String password, int employeeId, String firstName, String lastName,
			String registrationNumber) {
		super(id, userName, password);
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.registrationNumber = registrationNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}
