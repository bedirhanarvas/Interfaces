package Adopters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdopters implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		//Mernis(authenticator) Codes

		return true;
	}

}
