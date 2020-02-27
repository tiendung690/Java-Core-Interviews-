package com.java.library.core.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseWordsInASentenceTest {

	private String expected;
	private String input;

	@Test
	public void reverseWordsInASentence1() {
		expected = "Alice";
		input = "Alice";

		test(expected, input);
	}

	@Test
	public void reverseWordsInASentence2() {
		expected = "Alice likes";
		input = "likes Alice";

		test(expected, input);
	}

	@Test
	public void reverseWordsInASentence3() {
		expected = "Alice likes Bob";
		input = "Bob likes Alice";

		test(expected, input);
	}

	@Test
	public void reverseWordsInASentence4() {
		expected = "Alice doesn't like Bob";
		input = "Bob like doesn't Alice";

		test(expected, input);
	}

	private void test(String expected, String input) {
		assertEquals(expected, ReverseWordsInASentence.reverseWordsInASentence(input));
	}

}