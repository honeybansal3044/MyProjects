package com.edu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw () {
		System.out.println("Pont A (" +pointA.getX() +"," +pointA.getY() +")");
		System.out.println("Pont B (" +pointB.getX() +"," +pointB.getY() +")");
		System.out.println("Pont C (" +pointC.getX() +"," +pointC.getY() +")");
	}
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	public void setBeanName(String beanName) {
		System.out.println("Bean Name is :- " +beanName);
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean Init method is called for Triangle Bean");
		
	}
	public void destroy() throws Exception {
		System.out.println("DisposableBean Destroy method is called for Triangle Bean");
		
	}
	
	public void initBean() {
		System.out.println("initBean method is called for Triangle Bean");
	}
	
	public void destroyBean() {
		System.out.println("destroyBean method is called for Triangle Bean");
	}
	
}
