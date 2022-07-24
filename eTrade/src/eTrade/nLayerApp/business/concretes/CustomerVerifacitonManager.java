package eTrade.nLayerApp.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.nLayerApp.business.abstracts.CustomerVerificationService;
import eTrade.nLayerApp.entities.concretes.Customer;

public class CustomerVerifacitonManager implements CustomerVerificationService {

	List<String> verifys;

	public CustomerVerifacitonManager() {
		super();
		verifys = new ArrayList<>();
	}

	@Override
	public void sendToVerifyMail(Customer customer) {
		System.out.println(customer.getFirstName() + ", " + customer.getEmail() + " adresine doğrulama gönderildi!!!");
	}

	@Override
	public boolean verifyMail(String email) {
		try {
			verifys.add(email);// dogrulanmıs mail list
			System.out.println("Mail adresi doğrulandı! Giriş yapabilirsiniz !");
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if (verifys.contains(email)) {
			return true;
		}
		return false;
	}

}
