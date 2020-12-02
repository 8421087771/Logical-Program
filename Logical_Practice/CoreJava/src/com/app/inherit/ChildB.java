package com.app.inherit;

public class ChildB extends ParentA {
	public void childM() {
		System.out.println("I am from child class");
	}

	public void m1() {
		System.out.println("I am from m1 child class");
	}

	public static void main(String[] args) {
		ParentA p = new ChildB();
		p.m1();
		//p.childM();

	}
}
