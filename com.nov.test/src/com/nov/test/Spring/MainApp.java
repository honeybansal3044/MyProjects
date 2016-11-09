package com.nov.test.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Honey Bansal
 */
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("Beans.xml");
			HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
			obj.getMessage();

		}catch(Exception e) {

		}finally {
			if(context != null) {
				((ClassPathXmlApplicationContext) context).close();
			}
		}
	}

}