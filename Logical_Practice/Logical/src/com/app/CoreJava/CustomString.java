package com.app.CoreJava;

public final class CustomString {

	private final int a;

	CustomString(int b) {
		a = b;
	}

	public CustomString set(int c) {
		if (this.a == c) {
			return this;
		} else
			return new CustomString(c);
	}

	public String toString() {
		return "CustomString [a=" + a + "]";
	}

}
/*
 * b = 10 c= 20
 * 
 * 
 */