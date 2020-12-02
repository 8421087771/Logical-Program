package com.app.multithread;

import java.util.ArrayList;
import java.util.List;

public class CompareTo {

	public static void main(String[] args) {
		List al=new ArrayList<>();
		try{
		al.add(32);
		al.add("ABB");
		al.add(89);
		System.out.println(al);
		 }
		 catch (Exception e) {
			    al.add(3);
				al.add(22);
				al.add(9);
				System.out.println(al);
		 }
		
	}

}
