package com.app.sin.design;

public class Singleton {
	private static Singleton insSingleton;

	private Singleton() {
	} 
	

	public static Singleton geSingleton() {
		if (insSingleton == null) {
			return insSingleton;
		}
		return insSingleton;

	}
}
