package com.cts.java8Practice;

import java.util.*;
import java.util.Arrays;

public class Example {
public static void main(String[] args) {
	
	List<Integer> values=Arrays.asList(1,2,3,4,5);
	
	System.out.println(values);
	/*
	 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i)); }
	 */
	/*
	 * for(int i:values) { System.out.println(i); }
	 */
	//values.forEach((i)->System.out.println(i));
	values.forEach(i->System.out.println(i));
	values.forEach(System.out::println);
	values.forEach(i->doubleit(i));
	values.forEach(Example::doubleit);
}

public static void doubleit(int i) {
	// TODO Auto-generated method stub
	System.out.println(i*2);
}

public static int doMultiply(int n, int m) {
	// TODO Auto-generated method stub
	return n*m;
}
}
