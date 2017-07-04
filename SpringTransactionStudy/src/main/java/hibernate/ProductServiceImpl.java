package hibernate;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Transactional
    public List<Product> loadProductsByName(String name) {
        List<Product> products = this.productDao.loadProductsByName(name);
        return products;
    }

    @Transactional(readOnly = true)
    public List<Product> findAllProducts() {
        //return this.productDao.findAllProducts();
    	return null;
    }

}
