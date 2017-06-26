package aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-aop.xml");

		CustomerBo service = context.getBean(CustomerBo.class);
		service.addCustomer();

		// ((ICustomerAspect) service).showCustomerDetails();

		((ConfigurableApplicationContext) context).close();
	}

}
