package com.java.library.core.recursion;

import org.junit.Test;

public class TowersOfHanoiTest {

	private int n;

	@Test
	public void compute1() throws Exception {
		n = 3;

		test(n);
	}

	private void test(int n) {
		TowersOfHanoi.compute(n);
	}

}