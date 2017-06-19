package examples;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import examples.config.AppConfig;

public class AppConfigTest {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(LifeCycleTest.class);
		
		context.close();
		
	}

}
