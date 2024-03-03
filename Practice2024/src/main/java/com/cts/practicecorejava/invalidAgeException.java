package com.cts.practicecorejava;

public class invalidAgeException extends Exception {

	public invalidAgeException(String s) {
		super(s);
		System.out.println(s);
	}
	
}
