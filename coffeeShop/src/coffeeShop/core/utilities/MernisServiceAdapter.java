package coffeeShop.core.utilities;

import java.rmi.RemoteException;

import coffeeShop.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
				customer.getDateOfBirthDay());
		return result;
	}

}
