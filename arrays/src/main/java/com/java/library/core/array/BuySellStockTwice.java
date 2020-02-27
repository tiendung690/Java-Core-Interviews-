package com.java.library.core.array;

import java.util.List;

public class BuySellStockTwice {

	/*
	 * 6.7
	 */

	public static int buySellStockTwice(List<Integer> A) {
		Integer a1 = 0, b1 = 0, p1 = 0;
		Integer a2 = 0, b2 = 0, p2 = 0;
		Integer min = Integer.MAX_VALUE, minIndex = 0;
		Integer profit;
		Integer i = 0;
		for (Integer price : A) {
			if (price < min) {
				min = price;
				minIndex = i;
			}
			profit = price - min;
			if (profit > p2 && a2.equals(minIndex)) {
				b2 = i;
			} else if (profit > p2 && !a2.equals(minIndex)) {
				if (p1 < p2) {
					a1 = a2;
					b1 = b2;
				}
				a2 = minIndex;
				b2 = i;
			} else if (profit > p1 && !a2.equals(minIndex)) {
				a1 = minIndex;
				b1 = i;
			}

			p1 = profitBetweenPoints(a1, b1, A);
			p2 = profitBetweenPoints(a2, b2, A);
			i++;
		}
		return p1 + p2;
	}

	private static int profitBetweenPoints(int a, int b, List<Integer> A) {
		return A.get(b) - A.get(a);
	}

}
