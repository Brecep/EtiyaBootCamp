package entities.concretes;

import entities.abstracts.Entity;

public class Game implements Entity{
	private String name;
	private int price;
	private double rating;

	public Game(String name, int price, double rating) {
		super();
		this.name = name;
		this.price = price;
		this.rating = rating;
	}

	public Game() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

}
