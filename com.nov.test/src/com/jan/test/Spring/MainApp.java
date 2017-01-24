package com.jan.test.Spring;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Honey Bansal
 */
public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = null;
		try {
			String[] files = new String[] { "config\\Car.xml", "config\\Engine.xml" };

			context = new ClassPathXmlApplicationContext(files);

			Car c = (Car) context.getBean("car");
			c.printCar();

			Car car = (Car) context.getBean("cars");
			for (int i = 0; i < car.getNames().length; i++) {
				System.out.println(car.getNames()[i]);
			}
			for (int i = 0; i < car.getEngines().length; i++) {
				System.out.println(car.getEngines()[i].getModel());
			}

			Car carnames = (Car) context.getBean("carnames");
			Iterator<String> itr = carnames.getCarnames().iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((ClassPathXmlApplicationContext) context).close();
			}
		}
	}

}
