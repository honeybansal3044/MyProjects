package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {

	/*
	 * @Autowired annotation automatically inject the dependencies. Here it is using "byType".
	 * Ideally it should throw an error as there are more than one same type is defined (4 instance of Point object).
	 * But this works well if these properties are defined with the same name in spring.xml.
	 * That means Spring IOC container is smart enough to check the properties "byName" if it does not find the properties "byType"
	 * So if we configure 4 beans with name pointA, pointB, pointC, pointD... This will work fine. 
	 */
	@Autowired
	private Point pointA;
	@Autowired
	private Point pointB;
	@Autowired
	private Point pointC;
	@Autowired
	private Point pointD;
	
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
	public Point getPointD() {
		return pointD;
	}
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	
	public void draw() {
		System.out.println("Pont A (" +pointA.getX() +"," +pointA.getY() +")");
		System.out.println("Pont B (" +pointB.getX() +"," +pointB.getY() +")");
		System.out.println("Pont C (" +pointC.getX() +"," +pointC.getY() +")");
		System.out.println("Pont D (" +pointD.getX() +"," +pointD.getY() +")");	
	}
	
	
	
}
