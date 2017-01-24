package com.nov.test.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Honey Bansal
 */
public class MainApp2 {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("config\\Beans2.xml");
			HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
			obj.getMessage();
			obj.setMessage("Hello Again Scope Test!");

			HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
			obj1.getMessage();
			
			HelloWorld2 obj2 = (HelloWorld2) context.getBean("helloWorld2");
			obj2.getMessage();
			
		}catch(Exception e) {

		}finally {
			if(context != null) {
				((ClassPathXmlApplicationContext) context).close();
			}
		}
	}

}