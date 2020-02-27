package com.java.library.core.string;

import java.util.ArrayList;
import java.util.List;

public class ComputeValidIPAddresses {

	/*
	 * 7.10
	 */

	public static List<String> computeValidIPAddresses(String s) {
		final List<String> addresses = new ArrayList<>();
		int i, j, k;
		for (i = 1; i < 4 && i < s.length(); ++i) {
			final String first = s.substring(0, i);
			if (isValid(first)) {
				for (j = 1; j < 4 && i + j < s.length(); ++j) {
					final String second = s.substring(i, i + j);
					if (isValid(second)) {
						for (k = 1; k < 4 && i + j + k < s.length(); k++) {
							if (s.length() - (i + j + k) < 4 && s.length() - (i + j + k) > 0) {
								final String third = s.substring(i + j, i + j + k);
								final String fourth = s.substring(i + j + k, s.length());
								if (isValid(third) && isValid(fourth)) {
									addresses.add(first + "." + second + "." + third + "." + fourth);
								}
							}
						}
					}

				}
			}
		}
		return addresses;
	}

	private static boolean isValid(String s) {
		if (s.length() == 0)
			return false;
		int num = Integer.valueOf(s);
		if (s.length() == 3 && (num < 100 || num > 255))
			return false;
		if (s.length() == 2 && num < 10)
			return false;
		return true;
	}

}
