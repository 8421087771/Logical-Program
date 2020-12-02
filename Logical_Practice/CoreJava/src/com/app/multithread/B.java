package com.app.multithread;

public class B {
	public synchronized    void d2(A a) {
		System.out.println("thread2 start from b class");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			System.out.println("thread 2try to call blast()");
			a.last();
		}
	}

	public synchronized void last() {
		System.out.println("Inside B class last()");
	}
}
