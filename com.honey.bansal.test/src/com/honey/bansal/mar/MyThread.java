package com.honey.bansal.mar;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {
	
	List<String> abc = new ArrayList<String>();
	
	public synchronized void add(String name) {
		abc.add(name);
	}
	
	public synchronized int showSize() {
		return abc.size();
	}

	@Override
	public void run() {
		super.run();
		System.out.println(Thread.currentThread().getName());
		
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After sleep " + Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread th = new MyThread();
		MyThread th2 = new MyThread();

		th.setName("Honey");
		th2.setName("Isha");
		
		//th.start();
		//th2.start();
		
		final MyThread mth = new MyThread();

		class InnerThread extends Thread {
			@Override
			public void run() {
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(mth.showSize());
			}
		}
		
		Thread t1 = new InnerThread();
		Thread t2 = new InnerThread();
		
		t1.start();
		t2.start();
		
		mth.add("Honey");
	}
}