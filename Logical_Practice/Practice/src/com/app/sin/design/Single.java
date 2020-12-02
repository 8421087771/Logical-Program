package com.app.sin.design;

public class Single {

	private static Single ins = null;

	private Single() {

	}

	public static Single getIns() {
		if (ins == null) {
			ins = new Single();
		}
		return ins;
	}

}
