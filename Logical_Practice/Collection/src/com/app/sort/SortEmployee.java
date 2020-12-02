package com.app.sort;

import java.util.ArrayList;

public class SortEmployee implements Comparable<Integer>{

	
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(13);
		al.add(11);
		al.add(4);
		al.add(21);
		
		System.out.println(al);
		SortEmployee.main(10);
	}
	public static void main(int i) {
		System.out.println("overloaded method");
		System.out.println(i);
	}
	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
