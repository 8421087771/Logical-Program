package com.app.practice;

public class A {
public static void main(String[] args) {
	Practice pr=Practice.getInstance();
	Practice pr1= Practice.getInstance();
	
	CustomClass cs= new CustomClass();
	CustomClass cs1= new CustomClass();
	System.out.println(pr==pr1);
	System.out.println(cs==cs1);
}
}
