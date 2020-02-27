package com.java.library.core.linkedlist;

import com.java.library.core.datastructures.ListNode;

public class Palindromic {

	/*
	 * 8.11
	 */

	public static boolean isPalindromic(ListNode<Integer> list) {
		if (list.next == null)
			return true;

		ListNode<Integer> slow = new ListNode<>(0, list);
		ListNode<Integer> fast = new ListNode<>(0, list);
		ListNode<Integer> numbers = null;

		boolean add = true;

		// BUILD LIST TO STORE THE VARIABLES
		while (fast.next.next != null) {
			fast.next = fast.next.next;
			if (add) {
				numbers = new ListNode<>(slow.next.data, numbers);
				slow.next = slow.next.next;
			}
			add = !add;
		}

		// THERE ARE AN ODD NUMBER OF ELEMENTS
		if (add)
			slow = slow.next;

		// ITERATE THROUGH THE LIST
		while (slow.next != null) {
			if (slow.next.data != numbers.data) {
				return false;
			}
			slow.next = slow.next.next;
			numbers = numbers.next;
		}

		return true;
	}

}
