package kodlamaioDbWorkShop.entities;

public class Adress {
	private int id;
	private Customer customer;
	private String adressDetail;
	
	
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Adress(int id, Customer customer, String adressDetail) {
		super();
		this.id = id;
		this.customer = customer;
		this.adressDetail = adressDetail;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getAdressDetail() {
		return adressDetail;
	}


	public void setAdressDetail(String adressDetail) {
		this.adressDetail = adressDetail;
	}
	
	

}
