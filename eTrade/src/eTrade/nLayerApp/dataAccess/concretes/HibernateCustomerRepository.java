package eTrade.nLayerApp.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.nLayerApp.dataAccess.abstracts.HibernateCustomerDao;
import eTrade.nLayerApp.entities.concretes.Customer;

public class HibernateCustomerRepository implements HibernateCustomerDao {

	List<Customer> customers;

	public HibernateCustomerRepository() {
		customers = new ArrayList<>();
	}

	@Override
	public void add(Customer customer) {
		customers.add(customer);
	}

	@Override
	public void delete(Customer customer) {
		customers.remove(customer);
	}

	@Override
	public void update(Customer customer) {
		for (Customer item : customers) {
			if (item.getId() == customer.getId()) {
				customer.setFirstName(customer.getFirstName());
				customer.setLastName(customer.getLastName());
				customer.setEmail(customer.getEmail());
			}
		}
	}

	@Override
	public Customer get(String email) {
		for (Customer customer : customers) {
			if (customer.getEmail() == email) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public List<Customer> getAll() {
		return customers;
	}

}
