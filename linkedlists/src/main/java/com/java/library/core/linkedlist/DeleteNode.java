package com.java.library.core.linkedlist;

import com.java.library.core.datastructures.ListNode;

public class DeleteNode {

	/*
	 * 8.6
	 */

	public static void deleteNode(ListNode<Integer> node) {
		node.data = node.next.data;
		node.next = node.next.next;
	}

}
