package com.jpa.relationship;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.relationship.model.Product;
import com.jpa.relationship.model.Store;
import com.jpa.relationship.model.dao.ProductRepo;
import com.jpa.relationship.model.dao.StoreRepo;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

	@Autowired
	private StoreRepo storeRepo;

	@Autowired
	private ProductRepo productRepo;

	@Override
	public void run(String... args) throws Exception {

		Store s = new Store();
		s.setName("Store 1");

		Product p = new Product();
		p.setName("Product 1");
		
		p.addStore(s);
		
		//s.addProduct(p);

		productRepo.save(p);

		storeRepo.save(s);



		List<Store> stores = storeRepo.findAll();
		List<Product> products = productRepo.findAll();

		System.out.println("Done");

	}

}
