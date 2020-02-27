package com.java.library.core.binarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.library.core.datastructures.BinaryTree;
import com.java.library.core.util.BinaryTreeUtil;

public class IsSymmetricTest {

	private boolean expected;
	private BinaryTree<Integer> tree;

	@Test
	public void isSymmetric1() throws Exception {
		expected = false;
		tree = BinaryTreeUtil.getEvenTree();

		test(expected, tree);
	}

	@Test
	public void isSymmetric2() throws Exception {
		expected = false;
		tree = BinaryTreeUtil.getFigureTenDotOne();

		test(expected, tree);
	}

	@Test
	public void isSymmetric3() throws Exception {
		expected = true;
		tree = new BinaryTree<>(0);
		tree.right = new BinaryTree<>(1);
		tree.right.left = new BinaryTree<>(2);
		tree.left = new BinaryTree<>(1);
		tree.left.right = new BinaryTree<>(2);

		test(expected, tree);
	}

	@Test
	public void isSymmetric4() throws Exception {
		expected = false;
		tree = new BinaryTree<>(0);
		tree.right = new BinaryTree<>(1);
		tree.right.left = new BinaryTree<>(17);
		tree.left = new BinaryTree<>(1);
		tree.left.right = new BinaryTree<>(42);

		test(expected, tree);
	}

	private void test(boolean expected, BinaryTree<Integer> tree) {
		assertEquals(expected, IsSymmetric.isSymmetric(tree));
	}

}