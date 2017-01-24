package com.jan.test.SpringBeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Honey Bansal
 */
public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("config\\DBBean.xml");
			DBConnect dbc = (DBConnect) context.getBean("db");
			dbc.save(1, "hello", 2);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((ClassPathXmlApplicationContext) context).close();
			}
		}
	}
}
