package com.feb.testconnection.pools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("config\\JdbcDS.xml");
			StudentBusinessOperations stbo = (StudentBusinessOperations) context.getBean("bo");
			int id = stbo.createStudent(new Student(7, "honey", "h@b.com", "memphis"));
			int id2 = stbo.updateStudent(new Student(8, "honey", "h@b.com", "memphis"));
			System.out.println(id + "---" + id2);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((ClassPathXmlApplicationContext) context).close();
			}
		}
	}
}
