package com.java.library.core.binarysearchtrees;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.java.library.core.datastructures.BinaryTree;
import com.java.library.core.util.BinaryTreeUtil;

public class MinimumHeightBSTTest {

	private BinaryTree<Integer> expected;
	private List<Integer> A;

	@Test
	public void build1() throws Exception {
		expected = BinaryTreeUtil.getEvenBST();
		A = Arrays.asList(0, 1, 2);

		test(expected, A);
	}

	@Test
	public void build2() throws Exception {
		expected = BinaryTreeUtil.getFullBST();
		A = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		test(expected, A);
	}

	@Test
	public void build3() throws Exception {
		expected = BinaryTreeUtil.getFullBST();
		A = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		test(expected, A);
	}

	private void test(BinaryTree<Integer> expected, List<Integer> A) {
		assertEquals(expected, MinimumHeightBST.build(A));
	}

}