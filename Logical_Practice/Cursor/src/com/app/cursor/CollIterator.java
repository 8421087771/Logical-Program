package com.app.cursor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollIterator {
	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> al = new ArrayList<Integer>();
		 * 
		 * for (int i = 1; i <= 10; i++) { al.add(i); } Iterator it = al.iterator();
		 * while (it.hasNext()) { Integer in = (Integer) it.next(); if ((in % 2) == 0) {
		 * System.out.println(in); } else it.remove(); }
		 */

		HashSet hs = new HashSet();
		for (int j = 1; j <= 10; j++) {
			hs.add(j);

		}
		Iterator itr = hs.iterator();

		while (itr.hasNext()) {
			int intr = (Integer) itr.next();
			if (intr % 3 == 0) {
				System.out.println(intr);

			}

			else
				itr.remove();
		}

	}

}