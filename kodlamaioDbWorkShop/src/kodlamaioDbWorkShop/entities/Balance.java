package kodlamaioDbWorkShop.entities;

import java.time.LocalDate;

public class Balance {
	private int id;
	private Customer customer;
	private LocalDate date;
	private int price;

	public Balance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Balance(int id, Customer customer, LocalDate date, int price) {
		super();
		this.id = id;
		this.customer = customer;
		this.date = date;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
