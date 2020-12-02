package com.app.failpass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFast {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(23, "Amit");
		m.put(24, "Bhagya");
		Iterator<Integer> it = m.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(m.get(it.next()));
			m.put(25, "JAdsu");
		}

	}
}
