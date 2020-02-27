package com.java.library.core.stacksandqueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.java.library.core.datastructures.BinaryTree;

public class ComputeBinaryTreeNodes {

	/*
	 * 9.7
	 */

	public static List<List<Integer>> binaryTreeDepthOrder(BinaryTree<Integer> tree) {
		List<List<Integer>> returnValue = new ArrayList<>();
		LinkedList<BinaryTree<Integer>> current = new LinkedList<>();
		LinkedList<BinaryTree<Integer>> next;
		current.add(tree);
		while (!current.isEmpty()) {
			next = new LinkedList<>();
			ArrayList<Integer> temp = new ArrayList<>();
			BinaryTree<Integer> node;
			while (!current.isEmpty()) {
				node = current.poll();
				if (node.left != null)
					next.add(node.left);
				if (node.right != null)
					next.add(node.right);
				temp.add(node.data);
			}
			returnValue.add(temp);
			current = next;
		}
		return returnValue;

	}
}
