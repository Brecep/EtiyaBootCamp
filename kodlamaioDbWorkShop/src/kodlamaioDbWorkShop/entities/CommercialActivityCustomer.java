package kodlamaioDbWorkShop.entities;

import java.util.List;

public class CommercialActivityCustomer extends IndividualCustomer {
	// private int id;

	private List<Balance> balances;

	public CommercialActivityCustomer(int id, String customerNumber, Channel channel, List<Adress> adresses,
			String firstName, String lastName, String nationaltyId, List<Balance> balances) {
		super(id, customerNumber, channel, adresses, firstName, lastName, nationaltyId);
		this.balances = balances;

	}

	public List<Balance> getBalances() {
		return balances;
	}

	public void setBalances(List<Balance> balances) {
		this.balances = balances;
	}
}
