package mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.Customer;

@Controller
public class AngularController {
	
	@RequestMapping(path = "/getCustomer")
	public ResponseEntity<List<Customer>> getCustomer(Model model) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(1, "Honey", "Memphis"));
		list.add(new Customer(2, "Isha", "Memphis"));
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(path = "/ng")
	public String showNgPage(Model model) {
		return "angular/ngAjax";
	}
}
