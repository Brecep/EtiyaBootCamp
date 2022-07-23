package interfaceDemo;

public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("My sql eklendi");
		
	}

}
