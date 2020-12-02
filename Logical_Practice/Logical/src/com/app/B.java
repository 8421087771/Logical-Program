package com.app;

public class B implements Runnable {
	
	boolean stop;
	public static void main(String[] args) {
		B b= new B();
		b.go();
		
	}
	public void go() {
		A a= new A(this);
		a.start();
		stop=true;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	

}
