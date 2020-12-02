   package com.app.logical;

public class PrimeNo {

	public static void main(String[] args) {
		int n = 11;
		int b=0;
		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				b = 1;
				break;
			}

			++i;

		}
		if (b == 0)
			System.out.println("prime no" + n);
		else
			System.out.println("not prime");

	}
}
