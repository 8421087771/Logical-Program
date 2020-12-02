package com.app.bhagya;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import com.app.collections.Method;

public class TestSort extends Method {
	
public static void main(String[] args) {
	System.out.println();
	
	
	
	System.out.println(String.class.getClassLoader()	);
	ArrayList al= new ArrayList();
			al.add(4);
			al.add(23);
			al.add(13);
			al.add(10);
			System.out.println(al);
			
			
			try{
			TreeSet ts=new TreeSet<>();
			ts.add(1);
			ts.add(23);
			ts.add("Amit");
			System.out.println(ts);}
			
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			HashSet hs=new HashSet<>();
			hs.add(12);
			hs.add(21);
			hs.add("Amit");
			hs.add(13);
			System.out.println(hs);
			
			
			
}




public  Method m1(int a) {
	return null;			}

}
