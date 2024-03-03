package com.cts.practicecorejava;

public class Student {

	int id;
	String name;
	double gpa;
	static int strength=0;
	static int mystudent=89; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		sayGoodbye();
		
		this.gpa = gpa;
	}
	public Student(int id, String name, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
		strength++;
	}
	
	public static int getStrength() {
		return strength;
	}
	public static void setStrength(int strength) {
		Student.strength = strength;
	}
	protected boolean isHonorRoll(double gpa) {
		if(gpa>3.5) {
			return true;
		}else {
			return false;
		}
	}
	public static void sayGoodbye() {
		int k=10;
		Student s5=new Student(k, "name", 6.7);
		
		s5.getGpa();
		System.out.println("Goodbye");
	}
	
}
