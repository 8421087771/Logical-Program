package com.app.CoreJava;

class Practice1 {
	int j = 10;
	int i = 1;

	public static void main(String[] args) {

		Practice1 p1 = new Practice1();
		p1.actice1();

	}

	void actice1() {
		
		if (i <j) {
			System.out.println("Pagal bhagya");
			++i;
			//System.exit(0);
			actice1();

		}
	}

}
