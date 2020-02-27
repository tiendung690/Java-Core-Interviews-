package com.java.library.core.binarysearchtrees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.library.core.datastructures.BinaryTree;
import com.java.library.core.util.BinaryTreeUtil;

public class IsBSTTest {

	private boolean expected;
	private BinaryTree<Integer> tree;

	@Test
	public void isBST1() throws Exception {
		expected = false;
		tree = BinaryTreeUtil.getEvenTree();

		test(expected, tree);
	}

	@Test
	public void isBST2() throws Exception {
		expected = true;
		tree = BinaryTreeUtil.getEvenBST();

		test(expected, tree);
	}

	@Test
	public void isBST3() throws Exception {
		expected = false;
		tree = BinaryTreeUtil.getFigureTenDotOne();

		test(expected, tree);
	}

	@Test
	public void isBST4() throws Exception {
		expected = true;
		tree = BinaryTreeUtil.getFigureFifteenDotOne();

		test(expected, tree);
	}

	private void test(boolean expected, BinaryTree<Integer> tree) {
		assertEquals(expected, IsBST.isBST(tree));
	}

}