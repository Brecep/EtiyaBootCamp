package entities;

import java.util.List;

public class AddressType {
	private int id;
	private String addressTypeName;
	private List<Address> addresses;// bu tip birden fazla adres olabilir

	public AddressType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressType(int id, String addressTypeName, List<Address> addresses) {
		super();
		this.id = id;
		this.addressTypeName = addressTypeName;
		this.addresses = addresses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressTypeName() {
		return addressTypeName;
	}

	public void setAddressTypeName(String addressTypeName) {
		this.addressTypeName = addressTypeName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
