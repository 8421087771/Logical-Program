package com.app.sort;

import java.util.HashSet;
import java.util.TreeSet;

import javax.print.attribute.HashAttributeSet;
public class TreeSetSort {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(9);
		ts.add(0);
		ts.add(5);
		System.out.println("Before Lambda=> Sort Default by tree set Ascending order:" + ts);

		TreeSet<Integer> ts1 = new TreeSet<Integer>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
		ts1.add(1);
		ts1.add(2);
		ts1.add(9);
		ts1.add(0);
		ts1.add(5);
		System.out.println("After Sort BY Lambda:" + ts1);

		HashSet<Integer> hm = new HashSet();
		hm.add(22);
		hm.add(43);
		hm.add(37);
		hm.add(8);
		System.out.println("HashSet Not sorting order preserve:" + hm);

	}

}
