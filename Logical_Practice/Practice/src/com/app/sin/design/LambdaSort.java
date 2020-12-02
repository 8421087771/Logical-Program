package com.app.sin.design;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSort {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(82);
		al.add(24);
		al.add(99);
		al.add(13);
		al.add(44);
		System.out.println(al);
		List<Integer> al8 = al.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Aftrer Sort: " + al8);

	}
}
