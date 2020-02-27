package com.java.library.core.stacksandqueue;

import java.util.LinkedList;

import com.java.library.core.datastructures.PostingListNode;

public class SearchPostingsList {

	/*
	 * 9.5
	 */

	public static void setJumpOrderRecursive(PostingListNode<Integer> node) {
		setJumpOrderRecursive(node, 0);
	}

	private static int setJumpOrderRecursive(PostingListNode<Integer> node, int order) {
		if (node != null && node.data == -1) {
			node.data = order++;
			order = setJumpOrderRecursive(node.jump, order);
			order = setJumpOrderRecursive(node.next, order);
		}
		return order;
	}

	public static void setJumpOrderIterative(PostingListNode<Integer> node) {
		LinkedList<PostingListNode<Integer>> queue = new LinkedList<>();
		PostingListNode<Integer> current = node;
		int order = 0;
		while (current != null || !queue.isEmpty()) {
			if (current == null || current.data != -1) {
				current = queue.poll();
			}
			if (current.data == -1)
				current.data = order++;
			if (current.next != null && current.next.data == -1)
				queue.addLast(current.next);
			current = current.jump;
		}
	}
}
