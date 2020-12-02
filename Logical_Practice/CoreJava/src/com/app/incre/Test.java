package com.app.incre;

public class Test implements A,B{
	
public static void main(String[] args) {
	Test t=new Test();
	t.m1();
}

@Override
public void m1() {
	System.out.println("Test");
}

}
