package coffeeShop.business.concretes;

import coffeeShop.business.abstracts.BaseCustomerManager;
import coffeeShop.entities.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	@Override
	public void save(Customer customer) throws Exception{
		super.save(customer);
	}
}
