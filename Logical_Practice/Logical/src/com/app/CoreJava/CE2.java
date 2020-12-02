package com.app.CoreJava;

import java.util.Scanner;

public class CE2 {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		if(age < 5) {
			throw new CE1("dont snd 0");
		}else if(age < 2){
			throw new CE1("dont snd 0");
		}else {
			System.out.println("");
		}
	}
}
