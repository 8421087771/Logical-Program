package com.app.logical;

public class Count_Char {

	public static void main(String[] args) {
		int count = 1;
		String str = "ramaaa";
		char[] ch = str.toCharArray(); 
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length() - 1; j++) {
				if (ch[i] == ch[j]) {
					count++;
					System.out.println(ch[i]+"::::"+count);
 				}
			}

			count = 1;
		}

	}

}
