package com.honey.bansal.oct;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class LocalInner1 implements Externalizable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7495114837094783794L;
	private int data = 30;// instance variable

	private class LocalInner2 {
	}

	void display() {
		Interface1.Inner inner = new Interface1.Inner();
		inner.i = 10;
		int data1 = 10;
		class Local {
			void msg() {
				System.out.println(data + data1);
			}
		}

		class Local1 extends Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local1 l1 = new Local1();
		Local l = new Local();
		l.msg();
		l1.msg();
	}

	public static void main(String args[]) {
		LocalInner1 obj = new LocalInner1();
		obj.display();
		obj.new LocalInner2();
		main();

		Thread thread1 = new Thread() {
			public void run() {
				System.out.println(11111);
			}
		};
		thread1.start();
	}

	public static void main() {
		LocalInner1 obj = new LocalInner1();
		obj.display();
		obj.new LocalInner2();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

	}
}
