package inheritance2;

public class CustomerManager {
	private Logger[] loggers;

	public CustomerManager() {
		super();
	}

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Musteri Eklendi : " + customer.getFirstName() + " " + customer.getLastName());
		Utils.runLoggers(loggers, customer.getFirstName() + " " + customer.getLastName());
	}

	public void delete(Customer customer) {
		System.out.println("Musteri Silindi : " + customer.getFirstName() + " " + customer.getLastName());
		Utils.runLoggers(loggers, customer.getFirstName() + " " + customer.getLastName());
	}
}
