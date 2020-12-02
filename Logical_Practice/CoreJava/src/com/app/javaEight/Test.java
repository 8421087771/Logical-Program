package com.app.javaEight;

public class Test implements DefaultInt, DefaultInt2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DefaultInt.super.m1();
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.m1();

	}

}