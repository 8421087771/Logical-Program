package com.app.failpass;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {

	public static void main(String[] args) {
		Map<Integer, String> m = new ConcurrentHashMap<>();
		m.put(23, "Amit");
		m.put(24, "Bhagya");
		Iterator<Integer> it = m.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(m.get(it.next()));
			m.put(25, "JAdsu");
		}

	}
}
