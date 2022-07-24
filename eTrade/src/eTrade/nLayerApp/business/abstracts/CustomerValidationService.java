package eTrade.nLayerApp.business.abstracts;

import java.util.List;

import eTrade.nLayerApp.entities.concretes.Customer;

public interface CustomerValidationService {
	boolean checkEmailFormat(Customer customer);

	boolean checkEmailDuplicate(Customer customer, List<Customer> customerList);

	boolean checkPassword(Customer customer);

	boolean checkFirstName(Customer customer);

	boolean checkLastName(Customer customer);

	boolean allCheck(Customer customer, List<Customer> customerList);
}
