package com.app.CoreJava;

public class RunFlow {

	{													// 2.

		System.out.println("Hi Non Static");

	}
 
	RunFlow() {									        // 3.

		System.out.println("constructor");

	}

	static {                                             // 4.           // 6.

		// new RunFlow();

		System.out.println("Hi static");
	}

	public static void main(String[] args) {             // 1.

		RunFlow re = null;								 // 5.          // 7.
		
		System.out.println(re);                                         // 8.

	}
}
