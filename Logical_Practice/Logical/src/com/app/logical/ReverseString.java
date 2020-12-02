package com.app.logical;

public class ReverseString {
	public static void main(String[] args) {
		String s = "Amit";
		String rev = "";
	    char[] ch = s.toCharArray();
		for (int i = s.length()-1; i >= 0; i --){
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
}
}