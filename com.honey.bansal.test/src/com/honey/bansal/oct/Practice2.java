package com.honey.bansal.oct;

import com.honey.bansal.oct2.Practice4;

public class Practice2 extends Practice5 implements Cloneable, Practice4{
	
	static int number = 10;
	
	public Practice2() {
		System.out.println("Hello ");
	}
	
	public Practice2(String name){
		this();
		System.out.println(name);
	}
	
	@Override
	public String toString() {
		return "Bansal";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Practice2 p2 = new Practice2("Honey");
		Practice2 p3 = (Practice2) p2.clone();
		System.out.println(i);
		System.out.println(p3.toString());
	}

	@Override
	public void Method1() {
		System.out.println("method");
	}

}
