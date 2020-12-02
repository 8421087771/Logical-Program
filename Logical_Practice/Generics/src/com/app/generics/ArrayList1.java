package com.app.generics;

import java.util.ArrayList;

//Type safety
class A<T> {
	T i;
}

/*
 * 
 * If we want varry datatype in child class or related class then we go 
 * for generics concepts
 * 
 */

public class ArrayList1 {

	public static void main(String[] args) {
		A<Integer> a1 = new A<Integer>();
		a1.i = 10;
		System.out.println(a1.i);

		A<String> a2 = new A<String>();
		a2.i = "10";
		System.out.println(a2.i);
		////// Type Casting//////
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		int i = list.get(0); /// type casting
		System.out.println(i);
	}

}
