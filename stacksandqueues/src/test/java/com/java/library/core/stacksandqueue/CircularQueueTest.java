package com.java.library.core.stacksandqueue;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.java.library.core.util.StreamUtil;

public class CircularQueueTest {

	private final int capacity = 10;
	private int size;

	@Test
	public void circularQueue1() throws Exception {
		size = 5;

		test(size);
	}

	@Test
	public void circularQueue2() throws Exception {
		size = 10;

		test(size);
	}

	@Test
	public void circularQueue3() throws Exception {
		size = 50;

		test(size);
	}

	private void test(int size) {
		final CircularQueue queue = new CircularQueue(capacity);
		List<Integer> integers = StreamUtil.sequence(size);
		integers.forEach(i -> queue.enqueue(i));
		integers.forEach(i -> assertEquals(i, queue.dequeue()));
	}

}