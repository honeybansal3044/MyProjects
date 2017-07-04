package hibernate;

import java.util.List;

public interface ProductService {
	
	public List<Product> loadProductsByName(String name);
	
	public List<Product> findAllProducts();
}
