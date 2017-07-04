package hibernate;

import java.util.List;

public interface ProductDao {
	
	public List<Product> loadProductsByName(String name);
}
