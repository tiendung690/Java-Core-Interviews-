package com.java.library.core.binarysearchtrees;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.java.library.core.datastructures.BinaryTree;
import com.java.library.core.util.BinaryTreeUtil;

public class ReconstructBSTTest {

	private BinaryTree<Integer> expected;
	private List<Integer> preOrder;

	@Test
	public void reconstruct1() throws Exception {
		expected = BinaryTreeUtil.getEvenBST();
		preOrder = Arrays.asList(1, 0, 2);

		test(expected, preOrder);
	}

	@Test
	public void reconstruct2() throws Exception {
		expected = BinaryTreeUtil.getFigureFifteenDotOne();
		preOrder = Arrays.asList(19, 7, 3, 2, 5, 11, 17, 13, 43, 23, 37, 29, 31, 41, 47, 53);

		test(expected, preOrder);
	}

	private void test(BinaryTree<Integer> expected, List<Integer> preOrder) {
		assertEquals(expected, ReconstructBST.reconstruct(preOrder));
	}

}