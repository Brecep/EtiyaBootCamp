package inheritance2;

public class Main {

	public static void main(String[] args) {
		Customer recep = new Customer(1, "Recep", "Bayindir");
		Customer engin = new Customer(2, "Engin", "Demirog");

		Logger[] loggers = { new DatabaseLogger(), new EmailLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);
		customerManager.add(recep);
		System.out.println("------------------------");
		customerManager.add(engin);

		System.out.println("------------------------");

		customerManager.delete(recep);
		System.out.println("------------------------");
		customerManager.delete(engin);

	}

}
