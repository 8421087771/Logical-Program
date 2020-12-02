package com.app.recursion;

interface Left{
	default void m1() {
		System.out.println("Left");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right");
	}
}

public class Test implements Left,Right {
	@Override
	public void m1() {
		System.out.println("child");
	}
	public static void main(String[] args) {

		Test t=new Test();
		t.m1();
	}

}
