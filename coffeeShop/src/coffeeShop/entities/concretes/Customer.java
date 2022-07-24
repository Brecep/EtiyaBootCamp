package coffeeShop.entities.concretes;

import java.time.LocalDate;
import java.util.Date;

import coffeeShop.entities.abstracts.Entity;

public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirthDay;
	private String nationalityId;

	public Customer(int id, String firstName, String lastName, int dateOfBirthDay, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthDay = dateOfBirthDay;
		this.nationalityId = nationalityId;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getDateOfBirthDay() {
		return dateOfBirthDay;
	}

	public void setDateOfBirthDay(int date) {
		this.dateOfBirthDay = date;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	
}