package entities;

public class BankUser extends User {
	private int bankUserId;
	private Bank bank;

	public BankUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankUser(int id, String userName, String password, int bankUserId, Bank bank) {
		super(id, userName, password);
		this.bankUserId = bankUserId;
		this.bank = bank;
	}

	public int getBankUserId() {
		return bankUserId;
	}

	public void setBankUserId(int bankUserId) {
		this.bankUserId = bankUserId;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

}
