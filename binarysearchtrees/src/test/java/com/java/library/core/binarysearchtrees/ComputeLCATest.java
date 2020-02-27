package com.java.library.core.binarysearchtrees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.library.core.datastructures.BinaryTree;
import com.java.library.core.util.BinaryTreeUtil;

public class ComputeLCATest {

	private BinaryTree<Integer> expected;
	private BinaryTree<Integer> tree;
	private BinaryTree<Integer> s;
	private BinaryTree<Integer> b;

	@Test
	public void findLCA1() throws Exception {
		tree = BinaryTreeUtil.getEvenBST();
		expected = tree;
		s = tree.left;
		b = tree.right;

		test(expected, tree, s, b);
	}

	@Test
	public void findLCA2() throws Exception {
		tree = BinaryTreeUtil.getFigureFifteenDotOne();
		expected = tree.left;
		s = tree.left.left.right;
		b = tree.left.right.right.left;

		test(expected, tree, s, b);
	}

	private void test(BinaryTree<Integer> expected, BinaryTree<Integer> tree, BinaryTree<Integer> s,
			BinaryTree<Integer> b) {
		assertEquals(expected, ComputeLCA.findLCA(tree, s, b));
	}

}