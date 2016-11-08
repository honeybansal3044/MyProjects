package com.honey.bansal.thread;

public class ThreadTest {

	public static synchronized void main(String[] args) throws InterruptedException {

		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("Kong");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (this) {
					notifyAll();
				}
			}
		};
		t.start();
		synchronized (t) {
			t.wait();
		}
		System.out.println("King");
	}
}
