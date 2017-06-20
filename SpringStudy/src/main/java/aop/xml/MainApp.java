package aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-aop.xml");

		CustomerImpl service = context.getBean(CustomerImpl.class);
		service.addCustomer();

		((ConfigurableApplicationContext) context).close();
	}

}
