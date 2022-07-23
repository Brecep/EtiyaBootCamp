package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleDatabaseManager());
		customerManager.baseDatabaseManager = new SqlDatabaseManager();//updated
		customerManager.baseDatabaseManager = new MySqlDatabaseManager();//updated
		customerManager.getCustomers();
	}

}
