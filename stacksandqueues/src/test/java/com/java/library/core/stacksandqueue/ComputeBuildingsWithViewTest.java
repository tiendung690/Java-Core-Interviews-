package com.java.library.core.stacksandqueue;

import static org.junit.Assert.assertTrue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import org.junit.Test;

import com.java.library.core.datastructures.BuildingWithHeight;

public class ComputeBuildingsWithViewTest {

	private Deque<BuildingWithHeight> expected;
	private LinkedList<Integer> sequence;

	@Test
	public void examineBuildingsWithSunset1() {
		expected = new ArrayDeque<>(Arrays.asList(new BuildingWithHeight(4, 5)));
		sequence = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

		test(expected, sequence);
	}

	@Test
	public void examineBuildingsWithSunset2() {
		expected = new ArrayDeque<>(Arrays.asList(new BuildingWithHeight(4, 1), new BuildingWithHeight(3, 2),
				new BuildingWithHeight(2, 3), new BuildingWithHeight(1, 4), new BuildingWithHeight(0, 5)));
		sequence = new LinkedList<>(Arrays.asList(5, 4, 3, 2, 1));

		test(expected, sequence);
	}

	@Test
	public void examineBuildingsWithSunset3() {
		expected = new ArrayDeque<>(Arrays.asList(new BuildingWithHeight(4, 2), new BuildingWithHeight(2, 4),
				new BuildingWithHeight(0, 5)));
		sequence = new LinkedList<>(Arrays.asList(5, 3, 4, 1, 2));

		test(expected, sequence);
	}

	private void test(Deque<BuildingWithHeight> expected, LinkedList<Integer> sequence) {
		Deque<BuildingWithHeight> result = ComputeBuildingsWithView.examineBuildingsWithSunset(sequence.iterator());
		expected.forEach(building -> {
			assertTrue(building.equals(result.removeFirst()));
		});
	}
}