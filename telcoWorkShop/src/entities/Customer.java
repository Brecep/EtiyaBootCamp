package entities;

import java.util.List;

public class Customer {
	private int id;
	private String customerNumber;
	private List<Subscription> subcriptions;// birden fazla abonelik
	private List<Address> addresses;//birden fazla adress

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String customerNumber, List<Subscription> subcriptions, List<Address> addresses) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
		this.subcriptions = subcriptions;
		this.addresses = addresses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public List<Subscription> getSubcriptions() {
		return subcriptions;
	}

	public void setSubcriptions(List<Subscription> subcriptions) {
		this.subcriptions = subcriptions;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
