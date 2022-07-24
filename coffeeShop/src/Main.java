import java.time.LocalDate;
import java.util.Date;

import coffeeShop.business.abstracts.BaseCustomerManager;
import coffeeShop.business.concretes.NeroCustomerManager;
import coffeeShop.business.concretes.StarbucksCustomerManager;
import coffeeShop.core.utilities.MernisServiceAdapter;
import coffeeShop.entities.concretes.Customer;

public class Main {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Customer recep = new Customer(1, "Recep", "Bayındır", 1997, "19196402888");
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Recep");
		customer.setLastName("Bayındır");
		customer.setDateOfBirthDay(1997);

		BaseCustomerManager manager = new StarbucksCustomerManager(new MernisServiceAdapter());
		manager.save(customer);
	}

}
