package com.java.library.core.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BaseConversionTest {

	private String expected;
	private String input;
	private int b1;
	private int b2;

	@Test
	public void baseConversion1() {
		expected = "314F";
		input = "12623";
		b1 = 10;
		b2 = 16;

		test(expected, input, b1, b2);
	}

	@Test
	public void baseConversion2() {
		expected = "-6CC2";
		input = "-62543";
		b1 = 7;
		b2 = 13;

		test(expected, input, b1, b2);
	}

	@Test
	public void baseConversion3() {
		expected = "111";
		input = "7";
		b1 = 10;
		b2 = 2;

		test(expected, input, b1, b2);
	}

	@Test
	public void baseConversion4() {
		expected = "33CD";
		input = "10001100101001";
		b1 = 2;
		b2 = 14;

		test(expected, input, b1, b2);
	}

	private void test(String expected, String input, int b1, int b2) {
		assertEquals(expected, BaseConversion.baseConversion(input, b1, b2));
	}

}