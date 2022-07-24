package eTrade.nLayerApp.business.abstracts;

import eTrade.nLayerApp.dataAccess.abstracts.HibernateCustomerDao;
import eTrade.nLayerApp.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	private CustomerValidationService customerValidationService;
	private CustomerVerificationService customerVerificationService;
	private HibernateCustomerDao hibernateCustomerDao;

	public BaseCustomerManager(CustomerValidationService customerValidationService,
			CustomerVerificationService customerVerificationService, HibernateCustomerDao hibernateCustomerDao) {
		super();
		this.customerValidationService = customerValidationService;
		this.customerVerificationService = customerVerificationService;
		this.hibernateCustomerDao = hibernateCustomerDao;
	}

	@Override
	public void register(Customer customer) {
		if (customerValidationService.allCheck(customer, hibernateCustomerDao.getAll())) {
			customerVerificationService.sendToVerifyMail(customer);
		} else {
			System.out.println("Kayıt Basarisiz");
		}
	}

	@Override
	public void login(String email, String password) {
		if (customerVerificationService.checkVerifyAccount(email)) {
			Customer findCustomerEmail = hibernateCustomerDao.get(email);
			if (findCustomerEmail.getEmail() == email && findCustomerEmail.getPassword() == password) {
				System.out.println("Giris Basarili");
			} else {
				System.out.println("Mail veya sifre hatali");
			}
		} else
			System.out.println("Hesap doğrulanamadı giris basarisiz");
	}

	@Override
	public void verifyAccount(Customer customer) {
		if (customerVerificationService.verifyMail(customer.getEmail())) {
			hibernateCustomerDao.add(customer);
		}
	}
}
