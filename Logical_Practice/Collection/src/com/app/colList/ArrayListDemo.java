package com.app.colList;

import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	al.add(23);
	al.add(3);
	al.add(232);
	System.out.println(al);
	al.add(2,"str");
	System.out.println(al);
	al.remove(2);
	System.out.println(al);
} 


}
