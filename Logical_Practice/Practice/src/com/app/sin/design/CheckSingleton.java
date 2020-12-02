package com.app.sin.design;

public class CheckSingleton {

	public static void main(String[] args) {
       Single sin= Single.getIns();
       Single sin2= Single.getIns();
       
       System.out.println(sin);
       System.out.println(sin2);

		
		
		
	}

}
