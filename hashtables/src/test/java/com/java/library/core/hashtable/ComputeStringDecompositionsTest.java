package com.java.library.core.hashtable;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.java.library.core.util.AssertUtils;

public class ComputeStringDecompositionsTest {

	private List<String> expected;
	private String s;
	private List<String> words;

	@Test
	public void findAllSubstring1() throws Exception {
		expected = Arrays.asList("aplanacan", "canaplana");
		s = "amanaplanacanalcanaplanaalpmna";
		words = Arrays.asList("can", "apl", "ana");

		test(expected, s, words);
	}

	private void test(List<String> expected, String s, List<String> words) {
		AssertUtils.assertSameContentsString(expected, ComputeStringDecompositions.findAllSubstring(s, words));
	}
}