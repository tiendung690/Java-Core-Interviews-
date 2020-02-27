package com.java.library.core.datastructures;

public class ServiceRequest {
	private String w;

	public ServiceRequest(String w) {
		this.w = w;
	}

	public String extractWordToCheckFromRequest() {
		return w;
	}
}
