package transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-transaction.xml");
		FooService fooService = (FooService) ctx.getBean("fooService");
		fooService.insertFoo(new Foo());

		((ClassPathXmlApplicationContext) ctx).close();
	}
}
