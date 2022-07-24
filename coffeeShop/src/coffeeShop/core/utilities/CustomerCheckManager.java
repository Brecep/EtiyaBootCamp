package coffeeShop.core.utilities;

import coffeeShop.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;//fake service
	}

}
