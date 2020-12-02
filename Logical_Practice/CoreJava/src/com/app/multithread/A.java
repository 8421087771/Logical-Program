package com.app.multithread;

public  class A {
	public synchronized void d1(B b) {
		System.out.println("thread start from A class");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			System.out.println("thread 1 try to call blast()");

			b.last();
		}

	}

	public synchronized void last() {
		System.out.println("Inside a this is Last()");
	}
}
