package dataAccess.concretes;

import entities.abstracts.Entity;
import entities.concretes.Player;

public class Sale implements Entity {
	private int id;
	private Player player;

	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sale(int id, Player player) {
		super();
		this.id = id;
		this.player = player;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
