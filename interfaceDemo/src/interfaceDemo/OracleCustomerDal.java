package interfaceDemo;

public class OracleCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("Oracle eklendi");

	}

}
