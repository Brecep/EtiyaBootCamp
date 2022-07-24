package eTrade.nLayerApp.api;

import eTrade.nLayerApp.business.abstracts.BaseCustomerManager;
import eTrade.nLayerApp.business.abstracts.CustomerValidationService;
import eTrade.nLayerApp.business.abstracts.CustomerVerificationService;
import eTrade.nLayerApp.business.concretes.CustomerManager;
import eTrade.nLayerApp.business.concretes.CustomerValidationManager;
import eTrade.nLayerApp.business.concretes.CustomerVerifacitonManager;
import eTrade.nLayerApp.core.utilities.adapter.GoogleLoginAdapter;
import eTrade.nLayerApp.dataAccess.abstracts.HibernateCustomerDao;
import eTrade.nLayerApp.dataAccess.concretes.HibernateCustomerRepository;
import eTrade.nLayerApp.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		HibernateCustomerDao hibernateCustomerDao = new HibernateCustomerRepository();
		CustomerValidationService validationService = new CustomerValidationManager();
		CustomerVerificationService verificationService = new CustomerVerifacitonManager();

		Customer customer1 = new Customer(1, "recep", "bayindir", "asldasda", "123");
		Customer customer2 = new Customer(2, "elif", "bayindir", "elif@gmail.com", "123456");
		Customer customer3 = new Customer(3, "bulent", "bayindir", "bulent@gmail.com", "123456");

		// google account
		BaseCustomerManager googleBaseCustomerManager = new GoogleLoginAdapter(validationService, verificationService,
				hibernateCustomerDao);
		// base
		BaseCustomerManager baseCustomerManager = new CustomerManager(validationService, verificationService,
				hibernateCustomerDao);

		googleBaseCustomerManager.register(customer3);
		googleBaseCustomerManager.verifyAccount(customer3);
		googleBaseCustomerManager.login(customer3.getEmail(), customer3.getPassword());

		System.out.println("----------------------------------------------");

		baseCustomerManager.register(customer3);
		baseCustomerManager.login(customer3.getEmail(), customer3.getPassword());

		System.out.println("-----------------------------------------------");

		baseCustomerManager.register(customer1);// exception
		System.out.println("-----------------------------------------------");

		baseCustomerManager.register(customer3);
		baseCustomerManager.login(customer3.getEmail(), customer3.getPassword());
	}

}
