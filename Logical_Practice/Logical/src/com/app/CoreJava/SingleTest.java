package com.app.CoreJava;

public class SingleTest {

	public static void main(String[] args) {

		Singleton instance= Singleton.getInstance();
		Singleton si=Singleton.getInstance();
		
		Singleton si1=Singleton.getInstance();
		System.out.println(si.hashCode());
	System.out.println(si1.hashCode());
	System.out.println(instance.hashCode());
	}

}
