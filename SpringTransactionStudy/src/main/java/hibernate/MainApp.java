package hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-hibernate.xml");

		ProductService service = (ProductService) ctx.getBean("myProductService");
		List<Product> products = service.loadProductsByName("mobile");

		if (products != null && !products.isEmpty()) {
			System.out.println(products.get(0).getName());
		}

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
