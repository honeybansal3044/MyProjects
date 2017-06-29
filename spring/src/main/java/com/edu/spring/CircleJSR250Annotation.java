package com.edu.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
/*
 * In this class we have defined JSR-250 (Java Specification Request) annotations. 
 * Point to note is that JSR-annotation is added to the Java SE v6. So it will be available for versions after that.
 * We have used following three annotations from JSR-250.
 * 1. @Resource:		This can be used to inject the dependency like showing below. 
 * 2. @PostConstruct:	This will be called post initializing bean from IOC container.  
 * 3. @PreDestroy:		This will be called Pre Destroying bean from IOC container. 
 */

@Component
public class CircleJSR250Annotation implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	@Required
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw() {
		System.out.println("Circle Point is ( " +center.getX() +"," +center.getY() +")");
		
	}
	
	@PostConstruct
	public void initCircle () {
		System.out.println("Inside @PostConstruct");
	}
	
	@PreDestroy
	public void destroyCircle () {
		System.out.println("Inside @PreDestroy");
	}

}
