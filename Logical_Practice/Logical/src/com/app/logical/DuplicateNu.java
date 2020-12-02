package com.app.logical;

public class DuplicateNu {

	public static void main(String[] args) {
		// int l[] = a.length;
		int a[] = { 18, 32, 92, 32, 87, 92};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					//a[j] = (a.length - 1);
					// a.length--;
				
					System.out.println(a[i]);	
				}

			}
			
		}
		
	}

}
