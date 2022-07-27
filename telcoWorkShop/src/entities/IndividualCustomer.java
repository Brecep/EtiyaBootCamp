package entities;

import java.util.List;

public class IndividualCustomer extends Customer {
	private String nationalIdentity;
	private String firstName;
	private String lastName;

	public IndividualCustomer() {
		super();
	}

	public IndividualCustomer(int id, List<Address> addresses, String customerNumber, List<Subscription> subscriptions,
			String nationalIdentity, String firstName, String lastName) {
		super(id, customerNumber, subscriptions, addresses);
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
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
}
