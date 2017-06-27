package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {
	
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
