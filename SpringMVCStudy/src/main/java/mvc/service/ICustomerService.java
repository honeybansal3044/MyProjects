package mvc.service;

import mvc.model.Customer;

public interface ICustomerService {

	public Customer getCustomer(int id);
	
	public String addCustomer(Customer customer);
	
	public String modifyCustomer(Customer customer);
	
	public String deleteCustomer(int id);
}
