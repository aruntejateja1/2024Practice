package com.cts.practicecorejava;

import java.util.*;
import java.util.Collections;
public class Exercise {

	public static void main(String[] args) {
		
		//int y;
//System.out.println("Enter y");
		//Scanner sc=new Scanner(System.in);
		//y=sc.nextInt();
		
		/*
		 * for(int j=0;j<y;j++) { System.out.println("Enter id"); int id=sc.nextInt();
		 * System.out.println("Enter name"); String name=sc.nextLine();
		 * System.out.println("Enter salary"); int salary=sc.nextInt(); Employee emp=new
		 * Employee(id,name,salary); }
		 */
		Employee emp=new Employee(1,"Ravi",50000);
		Employee emp1=new Employee(2,"Teja",20000);
		Employee emp2=new Employee(3,"noel",70000);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		System.out.println(list);
		
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(1);
		list2.add(2);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list2);
		
		String k="Arun";
		String regex="^[a-z A-Z]+$";
		System.out.println(k.matches(regex));
		
		char ch[]=k.toCharArray();
		System.out.println(Arrays.toString(ch));
		for(int u=0;u<ch.length;u++) {
			System.out.println(ch[u]);
			System.out.println("Ajlakjflk");
			list2.forEach(i->System.out.println(i));
			
		}
		
	}
	
	
}
