package com.etc._12singleInstance;

public class AppleTwo {
	public static AppleTwo apple = new AppleTwo(); // ถ๖บบ

	private AppleTwo() {

	}

	public static AppleTwo getInstance() {

		return apple;
	}
}
