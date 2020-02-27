package com.java.library.core.array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.java.library.core.util.StreamUtil;

public class ComputeRandomSubsetTest {

	private int n;
	private int k;

	@Test
	public void randomSubset1() {
		n = 5;
		k = 3;

		test(n, k);
	}

	@Test
	public void randomSubset2() {
		n = 50;
		k = 15;

		test(n, k);
	}

	@Test
	public void randomSubset3() {
		n = 500;
		k = 50;

		test(n, k);
	}

	private void test(int n, int k) {
		final List<Integer> sequence = StreamUtil.sequence(n);
		final List<Integer> subset = ComputeRandomSubset.randomSubset(n, k);
		assertNotEquals(sequence, subset);
		assertEquals(k, subset.size());
		for (Integer i : subset) {
			assertTrue(sequence.contains(i));
			sequence.remove(i);
		}
	}

}