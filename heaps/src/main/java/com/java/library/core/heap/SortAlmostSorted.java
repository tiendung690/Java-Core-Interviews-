package com.java.library.core.heap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class SortAlmostSorted {

	/*
	 * 11.3
	 */

	public static List sort(Iterator<Integer> sequence, int k) {
		List<Integer> result = new ArrayList<>();
		PriorityQueue<Integer> shortList = new PriorityQueue<>(Integer::compareTo);

		// FILL INITIAL SHORT LIST
		int count = 0;
		while (count++ < k) {
			shortList.offer(sequence.next());
		}

		while (sequence.hasNext()) {
			result.add(shortList.remove());
			shortList.offer(sequence.next());
		}

		while (!shortList.isEmpty())
			result.add(shortList.remove());
		return result;
	}

}
