package aop.logging;

public class Calculator {
	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Calculator.add(19, 19);
	}
}
