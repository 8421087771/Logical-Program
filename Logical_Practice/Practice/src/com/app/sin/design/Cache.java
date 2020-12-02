package com.app.sin.design;

import java.util.HashMap;

public class Cache {
	private static Cache instance = null;
	private HashMap<String, Object> hm;

	private Cache() {
	}

	public static Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}

		return instance;
	}

	public void put(String key, Object value) {
		hm.put(key, value);
	}

	public Object get(String key) {

		return hm.get(key);
	}
	public boolean containsKey(String key) {
		return hm.containsKey(key) ;
	}

}
