package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mvc.model.Customer;
import mvc.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService service;

	@RequestMapping(path = "/customer", method = RequestMethod.GET)
	public ResponseEntity<Customer> getCustomer() {
		return new ResponseEntity<Customer>(new Customer(1, "Honey", "Memphis"), HttpStatus.OK);
	}

	@RequestMapping(path = "/customer/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Customer getCustomer(@PathVariable int id) {
		return service.getCustomer(id);
	}

}
