package com.java.library.core.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SpreadsheetColumnEncodingTest {

	private int result;
	private String code;

	@Test
	public void decodeSpreadsheetColumn1() {
		result = 1;
		code = "A";

		test(result, code);
	}

	@Test
	public void decodeSpreadsheetColumn2() {
		result = 4;
		code = "D";

		test(result, code);
	}

	@Test
	public void decodeSpreadsheetColumn3() {
		result = 27;
		code = "AA";

		test(result, code);
	}

	@Test
	public void decodeSpreadsheetColumn4() {
		result = 702;
		code = "ZZ";

		test(result, code);
	}

	private void test(int result, String code) {
		assertEquals(result, SpreadsheetColumnEncoding.decodeSpreadsheetColumn(code));
	}

}