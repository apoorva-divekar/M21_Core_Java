package com.cg.multithreading;

public class Counter {
	int count; 
	public synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws Exception {
		Counter c= new Counter();
		Thread t = new Thread(new Runnable() {
			public void run() {
				for (int i=1;i<=1000;i++) {
					c.increment();
				}
			}
		});
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i=1;i<=100;i++) {
					c.increment();
				}
			}
		});
		t.start();
		t1.start();
		t.join();
		t1.join();
		System.out.println(c.count);
	}

}
