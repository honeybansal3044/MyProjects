package com.nov.test.Spring;

import java.lang.reflect.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Honey Bansal
 */
public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("config\\Beans.xml");
			HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
			obj.getMessage();

			Class c = Class.forName("com.nov.test.Spring.HelloWorld");
			Constructor[] cons = c.getDeclaredConstructors();
			cons[0].setAccessible(true);
			HelloWorld h2 = (HelloWorld) cons[0].newInstance();
			
			//HelloWorld h2 = (HelloWorld) Class.forName("com.nov.test.Spring.HelloWorld").newInstance();
			h2.setMessage("Honey");
			h2.getMessage();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(context != null) {
				((ClassPathXmlApplicationContext) context).close();
			}
		}
	}

}
