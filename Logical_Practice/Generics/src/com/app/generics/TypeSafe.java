package com.app.generics;

import java.util.ArrayList;

public class TypeSafe {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Amit");
		al.add("Ashish");
		al.add(new Integer(10));
		System.out.println(al);

	}

}