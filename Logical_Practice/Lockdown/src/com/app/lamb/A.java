package com.app.lamb;

public final class A {
	private static A instance = null;

	private A() {

	}

	public static A getInstance() {
		if (instance == null) {
			instance = new A();
		}

		return instance;
	}
}
