package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAopConfig.class);

		CustomerServiceImpl service = context.getBean(CustomerServiceImpl.class);
		service.addCustomer();

		((ConfigurableApplicationContext) context).close();
	}

}
