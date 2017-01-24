package com.jan.test.SpringFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Honey Bansal
 */
public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("config\\CarFactory.xml");
			Car c = (Car) context.getBean("cf");
			c.drive();
			
			context = new ClassPathXmlApplicationContext("config\\CarFactory.xml");
			Car c2 = (Car) context.getBean("car");
			c2.drive();
			
			context = new ClassPathXmlApplicationContext("config\\CarFactory.xml");
			Car c3 = (Car) context.getBean("cf3");
			c3.drive();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((ClassPathXmlApplicationContext) context).close();
			}
		}
	}
}
