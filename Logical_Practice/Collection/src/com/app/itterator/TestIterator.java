package com.app.itterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class TestIterator {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int j = 1; j <= 13; j++) {
			al.add(j);
		}
		ListIterator<Integer> it = al.listIterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			if (i % 2 == 0)
				System.out.println(i);
			else
				it.remove();
		}

		HashSet hs = new HashSet();
		hs.add(123);
		hs.add(18);
		hs.add("Amit");
		hs.add(12);
		System.out.println(hs);

		HashSet hs1 = new HashSet();
		hs1.add(12);
		hs1.add("Amit");
		System.out.println(hs1);
	}
}
