 
package com.app.logical;

public class Armstrong {

	public static void main(String[] args) {
		int n = 153;
		int temp;
		int c = 0;
		temp = n;
		while (n > 0) {
			int a = n % 10;
			n = n / 10;
			c = c + (a * a * a);

		}

		if (temp == c) {
			System.out.println("Armstring Number");
		} else
			System.out.println("Armstrong");

	}

}
