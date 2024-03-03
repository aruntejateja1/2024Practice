package com.cts.java8Practice;

public interface I {

	void show();
	default void show2() {
		System.out.println("Default method in interface");
	}
	
	
	/*
	 * default boolean equals(Object o) { return true; }
	 */
	 
}
