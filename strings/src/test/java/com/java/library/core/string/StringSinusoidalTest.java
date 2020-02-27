package com.java.library.core.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringSinusoidalTest {

	private String expected;
	private String input;

	@Test
	public void snakeString1() {
		expected = "bacd";
		input = "abcd";

		test(expected, input);
	}

	@Test
	public void snakeString2() {
		expected = "e lHloWrdlo!";
		input = "Hello World!";

		test(expected, input);
	}

	private void test(String expected, String input) {
		assertEquals(expected, StringSinusoidal.snakeString(input));
	}

}