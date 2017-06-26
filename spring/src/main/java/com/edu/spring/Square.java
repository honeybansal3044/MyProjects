package com.edu.spring;

public class Square implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
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
