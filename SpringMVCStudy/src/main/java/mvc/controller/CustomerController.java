package mvc.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import mvc.model.Customer;
import mvc.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService service;

	@ModelAttribute("customer")
	public Customer addCustomer(@RequestParam int id, Model model, HttpSession session) {
		// model.addAttribute("customer", service.getCustomer(id));
		session.setAttribute("customer", service.getCustomer(id));
		return service.getCustomer(id);
	}

	@RequestMapping(path = "/customer")
	public ResponseEntity<Customer> getCustomer(Model model) {
		return new ResponseEntity<Customer>(new Customer(1, "Honey", "Memphis"), HttpStatus.OK);
	}

	@RequestMapping(path = "/customer/{id}")
	@ResponseBody
	public Customer getCustomer(@PathVariable int id) {
		return service.getCustomer(id);
	}

	@RequestMapping(path = "/customer1")
	public ResponseEntity<Customer> getCustomer(HttpEntity<byte[]> requestEntity) throws UnsupportedEncodingException {
		// String requestHeader = requestEntity.getHeaders().getFirst("MyRequestHeader");
		// byte[] requestBody = requestEntity.getBody();
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<Customer>(new Customer(1, "Honey", "Memphis"), responseHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(path = "/customer2")
	public ResponseEntity<Customer> getCustomer(@ModelAttribute Customer cust, BindingResult result) {
		return new ResponseEntity<Customer>(new Customer(1, "Honey", "Memphis"), HttpStatus.OK);
	}

	@RequestMapping(path = "/customer3")
	public ResponseEntity<Customer> getCustomer(@SessionAttribute Customer customer) {
		return new ResponseEntity<Customer>(new Customer(1, "Honey", "Memphis"), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/customer4")
	@ResponseBody
	public Customer getCustomer(@CookieValue("JSESSIONID") String cookie, @RequestHeader MultiValueMap<String, String> map) {
	    System.out.println(cookie);
	    return service.getCustomer(1); 
	}
}
