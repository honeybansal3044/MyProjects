package aop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import aop.Customer;

@Component
public class CustomerServiceImpl {

	private Customer customer;

	@Autowired
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void addCustomer() {
		System.out.println("Adding a customer, please wait.");

		this.customer.setName("Honey Bansal");
		this.customer.setCity("Memphis");
		System.out.println("Customer " + this.customer.getName() + " from " + this.customer.getCity() + " has been added.");

	}

}
