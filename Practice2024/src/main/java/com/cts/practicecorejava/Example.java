package com.cts.practicecorejava;

import java.util.Arrays;
import java.util.Scanner;



public class Example {

	static int w;
	public static void main(String[] args) throws invalidAgeException {
		// TODO Auto-generated method stub
		
System.out.println("Arun Teja Virat kohli");

int a=10;
byte b=11;
short c=13;
long k=9908450556l;
long h=3_123_456_789L;
float f=8.9f;
double g=8.9009d;
System.out.println(a+b+c);
System.out.format("arun is %f",g);
char j='a';
String name="arun";
final float pi =3.14F;
a=19;
System.out.println("\n"+h);
boolean r=true;
System.out.println(r);
System.out.println(10<9);


String txt="Hello world";
System.out.println(txt.toUpperCase());
System.out.println(txt.toLowerCase());
System.out.println(txt.indexOf("o"));
System.out.println(txt.length());
System.out.println(txt.startsWith("H"));
System.out.println(txt.replace("world", "arun"));
System.out.println(txt.endsWith("d"));

String text= "     "+ "Hello \"\r\t\fworld" +"   ";
System.out.println(text.trim());
System.out.println("ArunTeja".concat(" Virat kohli").toUpperCase());
int numbers[]={1,2,3,4,5};

int[] numbers1=new int[5];
int numbers2[];
int[] numbers3= {4,5,6,7,8};


System.out.println(Arrays.toString(numbers));


int numbers5[][]= {{1,2},{2,3}};
System.out.println(Arrays.deepToString(numbers5));

String role="admin";
switch(role) {
case "admin":
	System.out.println("YOu are a admin");
break;
case "moderator":
	System.out.println("you are a moderator");
break;
default:
	System.out.println("you are a guest");
}

int i=0;
while(i<5) {
	System.out.println(i);
	i++;
}

int l=0;
do {
	System.out.println(l);
	l++;
}while(l<5);

for(int y=0;y<5;y++) {
	System.out.println(y);
}

String fruits[]= {"Apples","oranges","bananas"};

for(int u=0;u<fruits.length;u++) {
	System.out.println(fruits[u]);
}

for(String fruit:fruits) {
	System.out.println(fruit);
}

String o="10";
int h3=20;
System.out.println(o+h3);
System.out.println(Math.round(1.1f));
System.out.println(Math.ceil(1.1f));
System.out.println(Math.floor(1.1f));
System.out.println(Math.max(1, 2));
System.out.println(Math.min(1,2));;
System.out.println(Math.pow(4, 2));
System.out.println(Math.round(Math.random()*100));
System.out.println(Math.abs(-8.7));
System.out.println(Math.sqrt(9));


Scanner sc=new Scanner(System.in);
//int age=sc.nextInt();
//String name1=sc.next();
//System.out.format("%s is %d years old",name1,age);
//if(name1.equalsIgnoreCase("arun")) {
//	System.out.println("\nequals method testing");

//}
String p="1";
int n=Integer.parseInt(p)+2;
System.out.println(n);

Integer myint=78;
System.out.println(myint.intValue());

int result =sum(10);
System.out.println(result);

try {
	int e=20/1;
}catch(Exception e){
	System.out.println("error");
	System.out.println(e.getMessage());
	e.printStackTrace();
}finally{
	System.out.println("fianlly block is executed");
}
System.out.println("HI");

checkAge(19);

Example ex=new Example();
System.out.println(ex.w);


Student student=new Student(2,"Arun",3.7);
Student student1=new Student(1,"Virat",9.8);
//student.setGpa(190);
System.out.println(student.getGpa());
System.out.println(student.isHonorRoll(student.getGpa()));


System.out.println(w);
int d = 0;
System.out.println(d);

System.out.println(student.strength);
System.out.println(student1.strength);

Student.sayGoodbye();

}

	private static void checkAge(int i) throws invalidAgeException {
		// TODO Auto-generated method stub
	if(i<18) {
		throw new invalidAgeException("Acces denied - youa re not 18 years old");
	}else {
		System.out.println("Access granted- You are 18 years old");
	}
	}

	private static int sum(int i) {
		// TODO Auto-generated method stub
		if(i>0) {
		return i+sum(i-1);
	}
		else {
			return 0;
		}
	}
}
