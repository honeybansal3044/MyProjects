package com.edu.spring;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	/*
	 * @Required annotation is used if we want this property required. It means bean will not be created 
	 * by IOC container if this property is not injected to this bean.
	 * So if I do not pass <property> param in the bean def, bean will not be created as center is required in order to create this bean
	 * we would need to configure following class in beans.xml in order to make it work. 
	 * org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor
	 */
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Circle Point is ( " +center.getX() +"," +center.getY() +")");
		
	}

}
