package entities.concretes;

import entities.abstracts.Entity;

public class Player implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirthDay;
	private String nationalityId;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String firstName, String lastName, int dateOfBirthDay, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthDay = dateOfBirthDay;
		this.nationalityId = nationalityId;
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

	public void setDateOfBirthDay(int dateOfBirthDay) {
		this.dateOfBirthDay = dateOfBirthDay;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}
