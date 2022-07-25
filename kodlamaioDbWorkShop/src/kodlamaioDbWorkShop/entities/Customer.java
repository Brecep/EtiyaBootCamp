package kodlamaioDbWorkShop.entities;

import java.util.List;

public class Customer {
	private int id;
	private String customerNumber;
	private Channel channel;
	private List<Adress> adresses; //one to many

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String customerNumber, Channel channel, List<Adress> adresses) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
		this.channel = channel;
		this.adresses = adresses;
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

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public List<Adress> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}

}
