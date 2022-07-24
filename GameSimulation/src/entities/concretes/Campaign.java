package entities.concretes;

import entities.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private String name;
	private double discountRate;

	public Campaign() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Campaign(int id, String name, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
