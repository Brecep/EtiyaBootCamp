package eTrade.nLayerApp.business.abstracts;

import eTrade.nLayerApp.entities.concretes.Customer;

public interface CustomerService {
	void register(Customer customer);

	void login(String email, String password);

	void verifyAccount(Customer customer);
}
