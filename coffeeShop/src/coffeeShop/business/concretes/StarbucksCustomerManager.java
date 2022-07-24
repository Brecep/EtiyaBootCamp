package coffeeShop.business.concretes;

import coffeeShop.business.abstracts.BaseCustomerManager;
import coffeeShop.core.utilities.CustomerCheckService;
import coffeeShop.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		try {
			if (customerCheckService.checkIfRealPerson(customer)) {
				super.save(customer);
			} else {
				throw new Exception("Not a valid person");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
