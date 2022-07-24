package eTrade.nLayerApp.business.concretes;

import eTrade.nLayerApp.business.abstracts.BaseCustomerManager;
import eTrade.nLayerApp.business.abstracts.CustomerValidationService;
import eTrade.nLayerApp.business.abstracts.CustomerVerificationService;
import eTrade.nLayerApp.dataAccess.abstracts.HibernateCustomerDao;

public class CustomerManager extends BaseCustomerManager{

	public CustomerManager(CustomerValidationService customerValidationService,
			CustomerVerificationService customerVerificationService, HibernateCustomerDao hibernateCustomerDao) {
		super(customerValidationService, customerVerificationService, hibernateCustomerDao);
		// TODO Auto-generated constructor stub
	}
	
}
