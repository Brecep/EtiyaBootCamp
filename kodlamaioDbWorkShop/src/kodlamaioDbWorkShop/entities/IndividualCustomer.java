package kodlamaioDbWorkShop.entities;

import java.util.List;

public class IndividualCustomer extends Customer {
	private String firstName;
	private String lastName;
	private String nationaltyId;
	private CommercialActivity activity;

	public IndividualCustomer() {
		super();
	}

	public IndividualCustomer(int id, String customerNumber, Channel channel, List<Adress> adresses, String firstName,
			String lastName, String nationaltyId, CommercialActivity activity) {
		super(id, customerNumber, channel, adresses);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaltyId = nationaltyId;
		this.activity = activity;
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

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}

	public CommercialActivity getActivity() {
		return activity;
	}

	public void setActivity(CommercialActivity activity) {
		this.activity = activity;
	}

}
