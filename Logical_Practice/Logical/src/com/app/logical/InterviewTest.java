package com.app.logical;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewTest {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(376);
		al.add(316);
		al.add(34);
		al.add(379);
		System.out.println(al);
		List l = al.stream().sorted((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0)
				.collect(Collectors.toList());
		
System.out.println(l);
	}
}
