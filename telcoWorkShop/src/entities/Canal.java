package entities;

import java.util.List;

public class Canal {
	private int id;
	private String canalName;
	private List<Payment> payments;

	public Canal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Canal(int id, String canalName, List<Payment> payments) {
		super();
		this.id = id;
		this.canalName = canalName;
		this.payments = payments;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCanalName() {
		return canalName;
	}

	public void setCanalName(String canalName) {
		this.canalName = canalName;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

}
