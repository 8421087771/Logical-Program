package com.app.sort.ownClass;

import java.util.ArrayList;
import java.util.Collections;



///own Custom Sort in List
public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(29, "AMit"));

		al.add(new Employee(67, "AMit"));
		al.add(new Employee(2, "AMit"));
		al.add(new Employee(9, "AMit"));
		System.out.println("Before Lambda==> Custom list Sort:   "+al);
		Collections.sort(al, (i1, i2) -> (i1.eid > i2.eid) ? -1 : (i1.eid < i2.eid) ? +1 : 0);
		System.out.println("After Lambda : "+al);
	}

}
