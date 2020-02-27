package com.java.library.core.greedyalgorithm;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class FindMajorityElementTest {

	private Character expected;
	private String sequence;

	@Test
	public void majoritySearch1() throws Exception {
		expected = 'a';
		sequence = "aca";

		test(expected, sequence);
	}

	@Test
	public void majoritySearch2() throws Exception {
		expected = 'a';
		sequence = "bacaabaaca";

		test(expected, sequence);
	}

	private void test(Character expected, String sequence) {
		assertEquals(expected, FindMajorityElement.majoritySearch(Arrays.asList(sequence).iterator()));
	}

}