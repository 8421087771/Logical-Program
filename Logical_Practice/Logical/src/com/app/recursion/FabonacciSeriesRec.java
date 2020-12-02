 package com.app.recursion;
 import java.util.Scanner;
public class FabonacciSeriesRec {
	static int a = 0, b = 1, sum;
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();

	public static void main(String[] args) {
		System.out.print(a + "  " + b);

		FabonacciSeriesRec ob = new FabonacciSeriesRec();

		ob.m1();
	}

	public void m1() {
		if (i >= 1) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.print(" " + sum);

			i--;
			m1();
		}

	}
}
