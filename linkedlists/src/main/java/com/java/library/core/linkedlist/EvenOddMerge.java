package com.java.library.core.linkedlist;

import java.util.Arrays;
import java.util.List;

import com.java.library.core.datastructures.ListNode;

public class EvenOddMerge {

	/*
	 * 8.10
	 */

	public static ListNode<Integer> merge(ListNode<Integer> list) {
		ListNode<Integer> even = new ListNode<>(0);
		ListNode<Integer> odd = new ListNode<>(1);
		List<ListNode<Integer>> tails = Arrays.asList(even, odd);
		int swap = 0;
		for (ListNode<Integer> iterator = list; iterator != null; iterator = iterator.next) {
			tails.get(swap).next = iterator;
			tails.set(swap, iterator);
			swap ^= 1;
		}
		tails.get(1).next = null;
		tails.get(0).next = odd.next;
		return even.next;
	}
}
