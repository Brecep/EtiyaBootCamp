package eTrade.nLayerApp.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.nLayerApp.business.abstracts.CustomerValidationService;
import eTrade.nLayerApp.entities.concretes.Customer;

public class CustomerValidationManager implements CustomerValidationService {

	@Override
	public boolean checkEmailFormat(Customer customer) {
		String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(customer.getEmail());
		if (matcher.matches()) {
			return true;
		}
		System.out.println("Geçerli bir email adres giriniz lütfen!");
		return false;

	}

	@Override
	public boolean checkEmailDuplicate(Customer customer, List<Customer> customerList) {
		for (Customer value : customerList) {
			if (customer.getEmail() == value.getEmail()) {
				System.out.println("Bu mail daha önce kullanıldıa!");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkPassword(Customer customer) {
		if (customer.getPassword().length() >= 6) {
			return true;
		}
		System.out.println("Parolanız 6 karakterden az olamaz!!!");
		return false;
	}

	@Override
	public boolean checkFirstName(Customer customer) {
		if (customer.getFirstName().length() > 1) {
			return true;
		}
		System.out.println("İsminiz 2 karakterden az");
		return false;
	}

	@Override
	public boolean checkLastName(Customer customer) {
		if (customer.getLastName().length() > 1) {
			return true;
		}
		System.out.println("Soyadiniz 2 karakterden az olamaz1!!");
		return false;
	}

	@Override
	public boolean allCheck(Customer customer, List<Customer> customerList) {
		return checkEmailFormat(customer) && checkEmailDuplicate(customer, customerList) && checkPassword(customer)
				&& checkFirstName(customer) && checkLastName(customer);
	}

}
