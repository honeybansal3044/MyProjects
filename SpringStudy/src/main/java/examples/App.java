package examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		AbstractCommandManager manager = context.getBean("commandManager", AbstractCommandManager.class);
		manager.procees();
		
		manager = context.getBean("commandManager", AbstractCommandManager.class);
		manager.procees();
		
		System.out.println(context.getBean(MyService.class));
		
		System.out.println(context.getBean(MyService.class));
		
		((ConfigurableApplicationContext) context).close();
	}
}
