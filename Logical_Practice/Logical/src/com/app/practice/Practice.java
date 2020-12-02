package com.app.practice;

public class Practice {
	private static Practice instance = null;

	public Practice() {
	}

	public static Practice getInstance() {
		if (instance == null) {
			instance = new Practice();
		}
			return instance;
	}

}
