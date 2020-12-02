package com.app.inherit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class B extends
 A{
	@Test
void m1() {
	System.out.println("m1 chgild");
	int a=10;
	assertEquals(10, a);
}
void m3() {
	System.out.println("m3");
}
public static void main(String[] args) {
	A ob= new B();
	ob.m1();
	ob.m2();
	//ob.m3();
	System.out.println("Hiii");
}
}
