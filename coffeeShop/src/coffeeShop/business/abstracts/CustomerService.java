package coffeeShop.business.abstracts;

import coffeeShop.entities.concretes.Customer;

public interface CustomerService {
	void save(Customer customer) throws Exception;
}
