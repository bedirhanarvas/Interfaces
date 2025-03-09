import java.util.Date;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adopters.MernisServiceAdopters;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;

public class Main {

	
	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarBucksCustomerManager(new MernisServiceAdopters());
		Customer customer =new Customer();
		customer.setId(1);
		customer.setFirstName("Ahmet Bedirhan Arvas");
		customer.setLastName("Arvas");
		customer.setIdentityId("28117886270");
		customer.setBirthday(new Date(2000, 2, 9));
		baseCustomerManager.save(customer);

		
		
	}

}
