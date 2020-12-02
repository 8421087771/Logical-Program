package com.app.test;

public class B {
	public static void main(String[] args) {
		B a = new B();
		// a.m();
		a.m3();

//	a.m1();
		System.out.println(":ASB");

	}

	public void m() throws ClassNotFoundException {
		System.out.println(Class.forName("A"));
	}

	public void m3() {
		System.out.println("after excep");
	}
}
