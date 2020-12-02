package com.app.bhagya;

public class Singleton {
			private static Singleton a;
			static Singleton instance(Singleton a) {
				if(a==null) {
					a=new Singleton();
				}
				return a;
		}
}
