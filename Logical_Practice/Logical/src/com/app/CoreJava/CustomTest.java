package com.app.CoreJava;

import java.util.HashMap;

public class CustomTest {
	public static void main(String[] args) {

		CustomString as = new CustomString(10);
		System.out.println(as);
		CustomString as1 = as.set(100);
		System.out.println(as1.equals(as));
		System.out.println(as);
		System.out.println(as1);
	}

}
