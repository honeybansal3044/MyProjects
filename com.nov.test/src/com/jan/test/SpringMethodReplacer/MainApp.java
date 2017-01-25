package com.jan.test.SpringMethodReplacer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Honey Bansal
 */
public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("config\\MethodReplacer.xml");
			Bank bank = (Bank) context.getBean("bank");
			bank.deposit();
			bank.withdraw();
			bank.calInterest();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((ClassPathXmlApplicationContext) context).close();
			}
		}
	}
}
