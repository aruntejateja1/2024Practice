package com.cts.java8Practice2;

public class MyPrinter {

	/*
	 * public void print(String str) { System.out.println(str); }
	 */
	
	public void print(String str,Parser P) {
		str=P.parse(str);
		System.out.println(str);
	}
}
