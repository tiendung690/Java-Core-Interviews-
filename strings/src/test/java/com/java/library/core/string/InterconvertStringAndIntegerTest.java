package com.java.library.core.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InterconvertStringAndIntegerTest {

	private Integer integer;
	private String string;

	@Test
	public void stringToInt1() {
		integer = 0;
		string = "0";

		testStringToInt(integer, string);
	}

	@Test
	public void stringToInt2() {
		integer = 1234;
		string = "1234";

		testStringToInt(integer, string);
	}

	@Test
	public void stringToInt3() {
		integer = -4321;
		string = "-4321";

		testStringToInt(integer, string);
	}

	private void testStringToInt(Integer integer, String string) {
		assertEquals(integer, InterconvertStringAndInteger.stringToInt(string));
	}

	@Test
	public void intToString1() {
		string = "0";
		integer = 0;

		testIntToString(string, integer);
	}

	@Test
	public void intToString2() {
		string = "1234";
		integer = 1234;

		testIntToString(string, integer);
	}

	@Test
	public void intToString3() {
		string = "-4321";
		integer = -4321;

		testIntToString(string, integer);
	}

	private void testIntToString(String string, int integer) {
		assertEquals(string, InterconvertStringAndInteger.intToString(integer));

	}
}