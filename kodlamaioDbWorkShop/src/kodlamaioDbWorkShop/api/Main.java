package kodlamaioDbWorkShop.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import kodlamaioDbWorkShop.entities.Adress;
import kodlamaioDbWorkShop.entities.Balance;
import kodlamaioDbWorkShop.entities.Channel;
import kodlamaioDbWorkShop.entities.CorparateCustomer;
import kodlamaioDbWorkShop.entities.Customer;

public class Main {

	public static void main(String[] args) {

		Channel channel = new Channel();
		List<Adress> adresses = new ArrayList<>();
		Adress adress = new Adress();
		// Balance balance = new Balance(1, customer,LocalDate.parse("2021-01-01"), 2);
		List<Balance> balances = new ArrayList<>();
		// Balance balance = new Balance();
		balances.add(null);
		adresses.add(adress);

		Customer customer = new CorparateCustomer(1, "532", channel, adresses, "Etiya", "1111111", null);

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer);

		Balance balance = new Balance(1, customer, LocalDate.parse("2022-01-01"), 12);

		List<Balance> balances1 = new ArrayList<Balance>();
		balances1.add(balance);

		Channel channel1 = new Channel(1, "internet", customers);

		customer.setAdresses(adresses);
		customer.setChannel(channel);
		((CorporateCustomer) customer).setBalances(balances1);

		System.out.println(customer.getId() + " " + ((CorporateCustomer) customer).getBalances().get(0).getPrice());
	}

}
