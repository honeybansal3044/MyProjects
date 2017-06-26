package mvc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import mvc.model.Customer;

@Service
public class CustomerService implements ICustomerService {

	private List<Customer> customers = new ArrayList<Customer>();

	@Override
	public Customer getCustomer(int id) {
		for (Customer cust : customers) {
			if (cust.getId() == id) {
				return cust;
			}
		}
		return new Customer(1, "Honey", "Memphis");
	}

	@Override
	public String addCustomer(Customer customer) {
		customers.add(customer);
		return "Addede";
	}

	@Override
	public String modifyCustomer(Customer customer) {
		for (Customer cust : customers) {
			if (cust.getId() == customer.getId()) {
				cust.setName(customer.getName());
				cust.setCity(customer.getCity());
				return "Modified";
			}
		}
		return null;
	}

	@Override
	public String deleteCustomer(int id) {
		Iterator<Customer> iterator = customers.iterator();
		Customer cust;
		while (iterator.hasNext()) {
			cust = iterator.next();
			if (cust.getId() == id) {
				iterator.remove();
				return "Deleted";
			}
		}
		return null;
	}
}
