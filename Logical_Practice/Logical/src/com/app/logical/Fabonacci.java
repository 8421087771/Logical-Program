package com.app.logical;

public class Fabonacci {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;

		System.out.println(a);
		System.out.println(b);
		int c;
		int i = 1;
		int n = 4;
		while (i <= n) {
			c = a + b;
			a = b;
			b = c;
			
			System.out.println(c);
			i++;
		}
	}
}
