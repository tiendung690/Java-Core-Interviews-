package com.java.library.core.primitives;

public class ComputeParity {

	/*
	 * 5.1
	 */

	public static short parity(long n) {
		n ^= n >>> 32;
		n ^= n >>> 16;
		n ^= n >>> 8;
		n ^= n >>> 4;
		n ^= n >>> 2;
		n ^= n >>> 1;
		return (short) (n & 0x1);
	}
}
