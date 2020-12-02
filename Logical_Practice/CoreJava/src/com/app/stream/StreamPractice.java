package com.app.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(289);
		al.add(56);
		al.add(79);
		al.add(96);
		List<Integer> l=al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	System.out.println(l);
	}
}
