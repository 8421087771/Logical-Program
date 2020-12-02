package com.app.practice;

final class CustomString {
	private final int age;

	public CustomString(int msg) {
		age = msg;
	}

	public CustomString instance(int msg2) {
		if (this.age == msg2) {
			return this;
		} else
			return new CustomString(msg2);
	}

	@Override
	public String toString() {
		return "CustomString [age=" + age + "]";
	}
	

}
