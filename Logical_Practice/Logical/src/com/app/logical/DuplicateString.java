package com.app.logical;

public class DuplicateString {
	public static void main(String[] args) {
		String s = "AB MAHBANT";
		String[] sp = s.split(" ");
		int n = 1;
		for (int i = 0; i <= sp.length - 1; i++) {
			for (int j = 1; j <= sp.length; j++) {
				if (sp[i].equals(sp[j])) {
					n = n + 1;
					sp[i] = "0";

				}

			}
			if (sp[i] != "0") {
				System.out.println(sp[i] + ":" + n);

			}
		}
	}

}
