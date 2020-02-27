package com.java.library.core.binarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.library.core.datastructures.BinaryTree;
import com.java.library.core.util.BinaryTreeUtil;

public class IsHeightBalancedTest {

	private boolean expected;
	private BinaryTree<Integer> tree;

	@Test
	public void isBalanced1() throws Exception {
		expected = true;
		tree = BinaryTreeUtil.getEvenTree();

		test(expected, tree);
	}

	@Test
	public void isBalanced2() throws Exception {
		expected = false;
		tree = BinaryTreeUtil.getOddTree();

		test(expected, tree);
	}

	@Test
	public void isBalanced3() throws Exception {
		expected = true;
		tree = BinaryTreeUtil.getFullTree();

		test(expected, tree);
	}

	@Test
	public void isBalanced4() throws Exception {
		expected = false;
		tree = BinaryTreeUtil.getFigureTenDotOne();

		test(expected, tree);
	}

	private void test(boolean expected, BinaryTree<Integer> tree) {
		assertEquals(expected, IsHeightBalanced.isBalanced(tree));
	}

}