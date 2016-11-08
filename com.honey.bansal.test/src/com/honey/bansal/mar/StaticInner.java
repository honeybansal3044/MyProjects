package com.honey.bansal.mar;

public class StaticInner {
	
	static int number = 10;
	
	static class MyInner {
		public void show() {
			System.out.println("show");
			number = 11;
		}
	}

	public static void main(String[] args) {
		StaticInner.MyInner i = new StaticInner.MyInner();
		i.show();
		
		StaticInner s = new StaticInner();
		
		MyInner m = new MyInner();
		m.show();

	}

}
