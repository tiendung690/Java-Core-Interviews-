package com.java.library.core.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.library.core.datastructures.TreeNode;
import com.java.library.core.util.TreeNodeUtil;

public class ComputeDiameterTest {

	private int expected;
	private TreeNode T;

	@Test
	public void computeDiameter1() throws Exception {
		expected = 31;
		T = TreeNodeUtil.getTreeNode();

		test(expected, T);
	}

	private void test(int expected, TreeNode T) {
		assertEquals(expected, ComputeDiameter.computeDiameter(T));
	}

}