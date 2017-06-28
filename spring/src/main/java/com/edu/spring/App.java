package com.edu.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	/*@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	Triangle triangle = (Triangle) factory.getBean("triangle");
    	triangle.draw();*/
    	
    	/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Triangle triangle = (Triangle) context.getBean("triangle-alias");
    	triangle.draw();*/
    	
    	// AbstractApplicationContext is used to register registerShutdownHook() which publishes the destroy event for all beans.
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	//context.registerShutdownHook();
    	Shape shape = (Shape) context.getBean("circle");
    	shape.draw();
    	context.close();
    }
}
