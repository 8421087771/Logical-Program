package com.app.functional;

public  class Jadu implements FunctionalInter, Interef {
  public static void main(String[] args) {
	Jadu j=new Jadu();
	j.m1();
	FunctionalInter.m2();
}

@Override
public void m1() {
	// TODO Auto-generated method stub
	FunctionalInter.super.m1();
}
}
