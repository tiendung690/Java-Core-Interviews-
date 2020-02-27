package com.java.library.core.string;

public class StringSinusoidal {

	/*
	 * 7.11
	 */

	public static String snakeString(String s) {
		StringBuilder snake = new StringBuilder();
		for (int i = 1; i < s.length(); i += 4)
			snake.append(s.charAt(i));
		for (int i = 0; i < s.length(); i += 2)
			snake.append(s.charAt(i));
		for (int i = 3; i < s.length(); i += 4)
			snake.append(s.charAt(i));
		return snake.toString();
	}

}
