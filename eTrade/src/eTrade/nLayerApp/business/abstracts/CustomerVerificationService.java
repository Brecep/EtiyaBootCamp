package eTrade.nLayerApp.business.abstracts;

import eTrade.nLayerApp.entities.concretes.Customer;

public interface CustomerVerificationService {
	void sendToVerifyMail(Customer customer);

	boolean verifyMail(String email);

	boolean checkVerifyAccount(String email);
}
