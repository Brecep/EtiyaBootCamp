package interfaceDemo;

public class CustomerManager {
	private CustomerDal customerDal;

	public CustomerManager(CustomerDal customerDal) {
		super();
		this.customerDal = customerDal;
	}

	public void add() {
		customerDal.add();
	}
}
