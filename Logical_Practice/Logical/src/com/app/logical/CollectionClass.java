package com.app.logical;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CollectionClass {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(14, "Bhag");
		hm.put(12, "Asert");
		hm.put(14, "fire");
		System.out.println(hm);

	}

}
