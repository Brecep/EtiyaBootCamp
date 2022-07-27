package entities;

public class Address {
	private int id;
	private String addressDetail;
	private AddressType addressTypeId;
	private Customer customerId;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String addressDetail, AddressType addressTypeId, Customer customerId) {
		super();
		this.id = id;
		this.addressDetail = addressDetail;
		this.addressTypeId = addressTypeId;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdressDetail() {
		return addressDetail;
	}

	public void setAdressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public AddressType getAdressTypeId() {
		return addressTypeId;
	}

	public void setAdressTypeId(AddressType addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

}
