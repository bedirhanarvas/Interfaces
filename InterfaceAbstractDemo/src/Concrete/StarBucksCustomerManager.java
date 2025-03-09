package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarBucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}
	
	
	
	@Override
	public void save(Customer customer)  {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db: "+customer.getFirstName());
		}else {
			System.out.println("You are not a real person!!!");
			
		}
		
		
		
	}
	
	

}
