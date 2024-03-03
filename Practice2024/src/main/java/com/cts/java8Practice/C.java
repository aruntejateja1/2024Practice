package com.cts.java8Practice;

public class C implements B,A{
//public class C extends D implements B{
public static void main(String[] args) {
	C obj=new C();
	A.Show();
	B b = new C();
	b.Show();
	
	obj.Show();
}


	
	
}
