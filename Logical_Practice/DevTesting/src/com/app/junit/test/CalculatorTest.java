package com.app.junit.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.app.target.Calculator;

public class CalculatorTest {
	Calculator cal;

	@BeforeClass
	public void init() {
		cal = new Calculator();
	}

	@Test
	public void addTest() {
		// Calculator cal = new Calculator();

		Integer actual = cal.ad(10, 20);
		Integer expected = 20;
		assertEquals(expected, actual);
	}

	@Test(expected = ArithmeticException.class)
	public void divTest() {

		cal.div(10, 0);
	}

	@Test(timeout = 1000)
	public void divTest_1() {

	}
}
