package com.app.CoreJava;

public class Override extends Overload {

	 void m1(long b) {
			System.out.println("long");
		}
	
	  void m1(int a) {
	  
	  System.out.println(" child int");
	  super.m1(a);
	  }
	 
		 
	
	
	public static void main(String[] a) {

		Override b =new Override();
		b .m1(1097323233);
	
	}

}
