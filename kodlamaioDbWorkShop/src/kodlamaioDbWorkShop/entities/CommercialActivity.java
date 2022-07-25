package kodlamaioDbWorkShop.entities;

public class CommercialActivity {
	private int id;
	private IndividualCustomer customer;

	public CommercialActivity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommercialActivity(int id, IndividualCustomer customer) {
		super();
		this.id = id;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IndividualCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(IndividualCustomer customer) {
		this.customer = customer;
	}

}
