package com.app.multithread;

public class Deadlockk extends Thread {
	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		a.d1(b); // this line executed by main thread

	}

	public void run() {
		b.d2(a); // this line execute by child thread
	}

	public static void main(String[] args) {
		Deadlockk d = new Deadlockk();
		d.m1();

	}

}
