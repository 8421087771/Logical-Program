package com.app.CoreJava;

import java.util.Scanner;

public class CustomizedExceptionDemo {
	public static void main(String[] args )  {
		Scanner sc= new Scanner(System.in);
		int age = sc.nextInt();
		if (age > 60) {
			throw new TooYoungException("please wait some more time.... u will get best match");
		} else if (age < 18) {
			throw new TooOldException("u r age already crossed....no chance of getting married");
		} else {
			System.out.println("you will get match details soon by e-mail");
		}
	}
}
 