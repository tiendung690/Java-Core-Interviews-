package com.java.library.core.string;

public class PalindromeAlphanumeric {

	/*
	 * 7.5
	 */

	public static boolean isPalindrome(String input) {
		char[] string = input.toLowerCase().toCharArray();
		int i1 = 0, i2 = string.length - 1;
		while (i1 < i2) {
			while (!isAlphanumeric(string[i1]) && i1 < i2) {
				i1++;
			}
			while (!isAlphanumeric(string[i2]) && i1 < i2) {
				i2--;
			}
			if (string[i1] != string[i2]) {
				return false;
			}
			i1++;
			i2--;
		}
		return true;
	}

	private static boolean isAlphanumeric(char c) {
		return ((97 <= c) && (c <= 122));
	}
}
