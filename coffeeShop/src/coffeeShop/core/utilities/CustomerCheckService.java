package coffeeShop.core.utilities;

import java.rmi.RemoteException;

import coffeeShop.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
