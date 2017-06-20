package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try {
			System.out.println("Using Java Config........");
			ApplicationContext context = new AnnotationConfigApplicationContext(SpringAopConfig.class);
	
			CustomerServiceImpl service = context.getBean(CustomerServiceImpl.class);
			service.addCustomer();
	
			((ConfigurableApplicationContext) context).close();
		}catch (Exception e) {
		}
		
		try {
			System.out.println("Using Xml Config........");
			ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-beans-aop-annotations.xml");
	
			CustomerServiceImpl service1 = context1.getBean(CustomerServiceImpl.class);
			service1.addCustomer();
	
			((ConfigurableApplicationContext) context1).close();
		}catch (Exception e) {
		}
	}

}
