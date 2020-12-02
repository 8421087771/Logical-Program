package com.app.sort.ownClass;

import java.util.ArrayList;
import java.util.Collections;

public class practice {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>() ;
al.add(7);
al.add(88);
al.add(7);
al.add(87);
System.out.println(al);
Collections.sort(al,(i1,i2)->(i1>i2)? 1: (i1<i2)? -1 : 0);
		System.out.println(al);
		
	}

}
