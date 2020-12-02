package com.app.functional;

public interface FunctionalInter {
default void m1() {
	System.out.println("I am default");
}
static void m2() {
	System.out.println("I am M2");
}
}
