package com.nov.test.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config\\Beans3.xml");

		HelloWorld3 objA = (HelloWorld3) context.getBean("helloWorld");

		objA.getMessage1();
		objA.getMessage2();

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
		HelloIndia objC = (HelloIndia) context.getBean("helloIndia2");
		objC.getMessage1();
		objC.getMessage2();
		objC.getMessage3();
		
		((ClassPathXmlApplicationContext) context).close();
	}
}
