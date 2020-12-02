package com.app.array;

public class Array {

	public static void main(String[] args) {
		/*
		 * // for every array type corresponding class are available and this classes
		 * are part of java language and not available to the programmer level
		 */
		int[][][] a = new int[3][2][8];
		System.out.println(a.getClass().getName());
		// System.out.println(args.length);

		// runtime exc -ve array size exc
		// int x[] = new int[-7];
		// System.out.println(x);

		// array of arrays
		int[][] b = new int[2][];
		b[0] = new int[2];
		b[1] = new int[3];

		int[] c = new int[3];
		System.out.println(c);
		System.out.println(c[0]);

		int[] d = { 29, 81, 88 };
		System.out.println(d[0]);

		int[][] e = { { 12, 33, 99 }, { 22, 11, 134 } };
		System.out.println(e[0][1]);

		// length vs length
		// length is a final variable applicable for arrays
		// length variable represent size of the array
		int[] f = new int[6];
		// System.out.println(f.length());
		System.out.println(f.length);        //6
		
		String g = new String("Amit");
		System.out.println(g.length());     //4
		//System.out.println(g.length);  
		

		String[] h = {"A","AA","AAA"};
		System.out.println(h.length);       // 3
	//	System.out.println(h.length());
	//	System.out.println(h[0].length);
		System.out.println(h[0].length()); // 1
		
		
		

	}

}
