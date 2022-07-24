package eTrade.nLayerApp.dataAccess.abstracts;

import java.util.List;

import eTrade.nLayerApp.entities.concretes.Customer;

public interface HibernateCustomerDao {
	void add(Customer customer);

	void delete(Customer customer);

	void update(Customer customer);

	Customer get(String email);

	List<Customer> getAll();
}
