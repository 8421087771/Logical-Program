package com.app.sort;

import java.util.TreeMap;

public class TreeMapSort {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(11, "Amit");
		tm.put(81, "AB MAhanat");
		tm.put(9, "Raje");
		tm.put(11, "Yamals");
		System.out.println("TreeMap by default Asc order:  " + tm);

		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0);
		tm1.put(11, "Amit");
		tm1.put(81, "AB MAhanat");
		tm1.put(9, "Raje");
		tm1.put(11, "Yamals");
		System.out.println("TreeMap Desc Sort By Lambda Exp:  " + tm1);

	}

}
