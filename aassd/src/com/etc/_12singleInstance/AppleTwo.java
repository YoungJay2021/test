package com.etc._12singleInstance;

public class AppleTwo {
	public static AppleTwo apple = new AppleTwo(); // ����

	private AppleTwo() {

	}

	public static AppleTwo getInstance() {

		return apple;
	}
}
