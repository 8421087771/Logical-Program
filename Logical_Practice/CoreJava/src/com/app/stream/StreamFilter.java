package com.app.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
   ///processing of collection element we stream api
public class StreamFilter {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(16);
		al.add(82);
		al.add(66); 
		al.add(99);
		System.out.println(al);

		// Stream by Filter
		List<Integer> al2 = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(al2);
 
		// Stream by Map
		List<Integer> al3 = al.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(al3);

		// stream by count
		long al4 = al.stream().filter(i -> i >= 35).count();
		System.out.println(al4);

		// Stream by Sort
		List<Integer> al5 = al.stream().sorted().collect(Collectors.toList());
		System.out.println("sort:"+al5);
     
		// Stream by Cu0stom Sorting
		List<Integer> al6 = al.stream().sorted((i1, i2) -> ((i1 > i2) ? -1 : (i1 < i2) ? +1 : 0))
				.collect(Collectors.toList());
		System.out.println("Descending: "  +al6);
		System.out.println();

		// Stream by natural Sorting by comparable
		List<Integer> al7 = al.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(al7);

		/// By String Sorting
		ArrayList<String> str = new ArrayList<String>();
		str.add("AMit");
		str.add("Ashish");
		str.add("Mahi");
		str.add("RAje");
		System.out.println(str);
		List<String> al8 = str.stream().sorted((s1, s2) -> s1.compareTo(s2))
									   .collect(Collectors.toList());
		System.out.println("al8:"+al8);

		// Stream by min and max
		Integer min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);

		Integer max = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);

		// Stream for Each loop
		Consumer<Integer> c = i -> {
			System.out.println("The Square of i:" + i + "is:" + (i * i));
		};
		al.stream().forEach(c);

		// Stream toArray (Convert Stream of object in array)
		Integer[] in = al.stream().toArray(Integer[]::new);
		for (Integer i1 : in) {
			System.out.println(i1);
		}
		
		
		///Stream stream.of() methods
		Stream<Integer> s=Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		/*
		 * for (Integer i1 : s) { System.out.println(i1); }
		 */
		
		
	}

}