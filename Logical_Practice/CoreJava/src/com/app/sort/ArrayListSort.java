package com.app.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(40);
		al.add(20);
		al.add(01);
		al.add(19);
		al.add(40);
		System.out.println(al);
		Collections.sort(al, (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0);
		//// Lambda Expression (no need to write
		//// extra custom Comparator class

		System.out.println(al);

		Set<String> s = new HashSet<>();
		s.add("Sunny");
		s.add("Bunny");
		s.add("manny");
		s.add("Runny");
		s.add("Sunny");
		System.out.println(s);

		Map m = new HashMap();
		m.put("AMit", "");
		m.put("Ashish", "");
		m.put("", "");
		System.out.println(m);

	}

}
