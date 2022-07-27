package telcoWorkShop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Address;
import entities.AddressType;
import entities.Canal;
import entities.Customer;
import entities.Equipment;
import entities.IndividualCustomer;
import entities.Invoice;
import entities.Payment;
import entities.Service;
import entities.Subscription;

public class Main {

	public static void main(String[] args) {
		Customer customer = new IndividualCustomer(1, null, "101", null, "15826032846", "Recep", "Bayindir");

		Address address = new Address(1, "Ankara/Batikent", null, customer);
		List<Address> addresses = new ArrayList<>();
		addresses.add(address);

		AddressType addressType = new AddressType(1, "Ev Adresi", addresses);

		Subscription subscription = new Subscription(1, LocalDate.parse("2022-07-27"), LocalDate.parse("2023-07-27"),
				customer, null, null);
		List<Subscription> subscriptions = new ArrayList<>();
		subscriptions.add(subscription);

		Service service = new Service(1, "vdls", subscriptions, null);// ekipman ekle

		Equipment equipment = new Equipment(1, "Turk Telekom", "Modem", "10810", service);
		List<Equipment> equipments = new ArrayList<Equipment>();
		equipments.add(equipment);

		Invoice invoice = new Invoice(1, LocalDate.parse("2022-07-27"), LocalDate.parse("2023-07-27"), subscription,
				null);
		List<Invoice> invoices = new ArrayList<>();
		invoices.add(invoice);

		Payment payment = new Payment(1, null, LocalDate.parse("2022-09-11"), invoice);
		List<Payment> payments = new ArrayList<Payment>();
		payments.add(payment);

		Canal canal = new Canal(1, "internet", payments);

		customer.setAddresses(addresses);
		customer.setSubcriptions(subscriptions);
		address.setAdressTypeId(addressType);
		subscription.setServiceId(service);
		subscription.setServiceId(service);
		service.setEquipments(equipments);
		invoice.setPaymentId(payment);
		payment.setCanalId(canal);

		System.out.println(customer.getAddresses().get(0).getAdressDetail());
		System.out.println(subscription.getCustomerId().getAddresses().get(0).getAdressDetail());
		System.out.println(
				payment.getInvoice().getSubscription().getCustomerId().getAddresses().get(0).getAdressDetail());

		System.out.println("-----------------------------");

		System.out.println(customer.getSubcriptions().get(0).getServiceId().getServiceName());
		System.out.println(
				service.getEquipments().get(0).getBrandName() + " : " + service.getEquipments().get(0).getEquimentName());
		
		System.out.println("-----------------------------");
		
		System.out.println(payment.getCanalId().getCanalName());
	}

}
