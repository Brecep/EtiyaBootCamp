package kodlamaioDbWorkShop.entities;

import java.util.List;

public class CorparateCustomer extends Customer {
	private String companyName;
	private String taxNo;
	private List<Balance> balances;

	public CorparateCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CorparateCustomer(int id, String customerNumber, Channel channel, List<Adress> adresses, String companyName,
			String taxNo, List<Balance> balances) {
		super(id, customerNumber, channel, adresses);
		this.companyName = companyName;
		this.taxNo = taxNo;
		this.balances = balances;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public List<Balance> getBalances() {
		return balances;
	}

	public void setBalances(List<Balance> balances) {
		this.balances = balances;
	}
	
}
