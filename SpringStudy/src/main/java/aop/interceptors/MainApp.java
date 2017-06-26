package aop.interceptors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-aop-interceptors.xml");

		CustomerService service = (CustomerService) context.getBean("customerAspect");
		service.addCustomer();

		((ConfigurableApplicationContext) context).close();
	}

}