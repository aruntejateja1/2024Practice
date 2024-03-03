package com.cts.java8Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.cts.java8Practice.Example;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A obj=new XYZ(); obj.show();
		 */	
		
		A obj;
		/*
		 * obj=new A() { public void show() { System.out.println("Hello world"); } };
		 */
		/*
		 * obj=()->{ System.out.println("Hello world"); };
		 */
		
		//obj=()-> System.out.println("Hello world");
		obj=(int i)-> System.out.println("Hellow world  "+i);
		obj=i-> System.out.println("Hello world  "+i);
		obj.show(8);
		
		//MyInteface m = null;
		//method1(m);
		
		/*
		 * method1(new MyInteface() { public void letc() {
		 * System.out.println("Hello from my interface"); } });
		 */

		//method1((n)-> sysout)
		
		/*
		 * method1(new MyInteface() { public void findSquare(int n) {
		 * System.out.println(n*n); } });
		 */
		//method1((n)->System.out.println(n*n));
		//method1((n,m)->System.out.println(n*m));
		
		
		/*
		 * method1(new MyInteface() { public int findSquare(int n,int m) { return m*n; }
		 * });
		 */
		
		//method1((n,m)->n*m);
		

		
		/*
		 * method1(new MyInteface() { public int findSquare(int n, int m) { return
		 * Example.doMultiply(n,m); } });
		 */
		
		//method1((n,m)->Example.doMultiply(n, m));
		//method1(Example::doMultiply);
		
		
		
		method1(new MyInteface() {
			public int findSquare(int n, int m) {
				return Example.doMultiply(n, m);
			}

			public void letc() { // TODO Auto-generated method stub

			}
		});
		 
		
		List<Integer> list5=new ArrayList<Integer>();
		for(int l=1;l<=100;l++) {
			list5.add(l);
		}
		
		 //System.out.println(list5);
		//  list5.forEach(i->System.out.println(i));
		  //System.out.println("\n\n");
		// list5.stream().forEach(System.out::println);
		 //list5.parallelStream().forEach(System.out::println);
		 
		/*
		 * list5.stream().filter(i->{ System.out.println("hi"); return true; });
		 */
		 //list5.clear();
		// list5.add(6);
			/*
			 * System.out.println(list5); list5.stream().filter(i->{
			 * System.out.println("hi"); return true; }).findFirst().orElse(0);
			 */
		 List<Integer> list6= Arrays.asList(4,2,1,3,6,305,998,774,236,881,10);
		// Collections.sort(list6);
		// Collections.reverse(list6);
		 Stream<Integer> s=list6.stream();
		 s.forEach(System.out::println);
		// s.forEach(System.out::println);
		 int result=0;
			/*
			 * for(int i:list6) { result=result+i*2; } System.out.println(result);
			 */
		 System.out.println(list6.stream().map(i->i*2).reduce(0,(c,e)->c+e));
		 
		 String s6[]=new String[5];
		 s6[0]="arun";
		 s6[1]="virat";
		// System.out.println(s6[2].toUpperCase());
		 Optional<String> o=Optional.ofNullable(s6[2]);
		 System.out.println(o);
		 if(o.isPresent()) {
			 System.out.println("value existed:"+o.get()+" "+o.get().toUpperCase());
		 }else {
			 System.out.println("value is not existed");
		 }
		 
		// Comparator<Integer> com = new CompImpl();
		/*
		 * Comparator<Integer> com=(o1,o2)->{ return o1%10>o2%10?1:-1; };
		 */
		 Comparator<Integer> com=(o1,o2)->{
				return o1>o2?1:-1;
			};
			Collections.sort(list6, com);
			
		 //Collections.sort(list6);
		// System.out.println(list6);
			list6.forEach(i->System.out.println(i));
			
			System.out.println(list6.stream().filter(i->(i%2==0)).collect(Collectors.toList()));
	//		list6.stream().filter(i->(i%2==0)).collect(Collectors.toList());
			System.out.println(list6.stream().count());
			System.out.println(list6.stream().filter(i->(i%2==0)).count());
			
			 Comparator<Integer> com1=(o1,o2)->{
					return o1>o2?1:-1;
				};
				//System.out.println(list6.stream().sorted(com1).collect(Collectors.toList()));
				System.out.println("Min Value "+ list6.stream().min(com1).get());
				System.out.println("max value" +list6.stream().max(com1).get());
				System.out.println(list6.stream().filter(i->(i%5==0)).map(i->i*2).findFirst().orElse(0));
				System.out.println(list6.stream().filter(LambdaDemo::isDivisible).map(LambdaDemo::mapDouble).findFirst().orElse(0));
				List<Integer> list7= new ArrayList<Integer>();
				list7= list6.stream().collect(Collectors.toList());
				System.out.println(list7);
				list7.forEach(i->System.out.println(i));
				long count=list7.stream().collect(Collectors.counting());
				System.out.println(count);
				Integer nob=list7.stream().collect(Collectors.summingInt(i->(i)));
				System.out.println(nob);
				System.out.println(list7.stream().collect(Collectors.averagingDouble(i->(i))));
				
				
				List<String > s8=new ArrayList<>();
				s8.add("Virat Kohli");
				s8.add(" is a");
				s8.add(" Captain of india");
				System.out.println(s8);
				Stream<String> s9=s8.stream().flatMap((String x)->{
			String[] value=x.split("");
			return Arrays.asList(value).stream();
				});
				
				System.out.println("s9:  "+s9);
				List<String> s10=s9.collect(Collectors.toList());
				System.out.println("s10:  "+s10);
				Object[] o2=s10.toArray();
				
				
				
				for(Object o1:o2) {
					System.out.println(o1);
				}
				
				int[] Array= {9,6,7,2,3,4,1};
				//Arrays.sort(Array);
				//Arrays.parallelSort(Array);
				//Arrays.sort(Array,0,4);
				Arrays.parallelSort(Array,0,4);
				for(int i:Array) {
					System.out.println(i);
				}
				
			Predicate<Integer> p=i->(i>20);
			System.out.println(p.test(50));
			System.out.println(p.test(20));
			
			Predicate<String> p1=s3->(s3.length()>5);
			System.out.println(p1.test("Virat kohli"));
			System.out.println(p1.test("Aru"));
				
			int[] x= {23,24,19,18,26,65,1,5,28};
			Predicate<Integer> p3=i->(i>20);
			Predicate<Integer> p4=i->(i%2==0);
			//method3(p3,x);
			//method3(p3.negate(),x);
			//method3(p3.and(p4),x);
			method3(p3.or(p4),x);
			
			List<Integer> numbers=Arrays.asList(2,6,6,8,8,9,9);
			System.out.println(numbers.stream().distinct().collect(Collectors.toList()));
				
			
			//List<Integer> values5=IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());
			//List<Integer> values5=IntStream.range(0,10).boxed().collect(Collectors.toList());
			List<Integer> values5=IntStream.rangeClosed(0,10).boxed().collect(Collectors.toList());
			System.out.println(values5);
			
			List<Integer> values2=IntStream.iterate(0,i->i+2).limit(10).boxed().collect(Collectors.toList());
			System.out.println("values2"+values2);
			
			//IntStream stream1=IntStream.generate(()->{return (int)(Math.random()*1000);});
			IntStream stream1=IntStream.generate(()->(int)(Math.random()*1000));
			stream1.limit(1).forEach(System.out::println);
			IntStream.rangeClosed(0, 4).forEach(i->System.out.println(i));
			
			IntStream stream3=IntStream.range(0, 10);
			List<Integer> primes=stream3.filter(i->i%2==0).boxed().collect(Collectors.toList());
			System.out.println("hi");
			//stream3.filter(i->i%2==0).boxed().collect(Collectors.toList()).forEach(i->System.out.println(i));
			System.out.println("hi");
			System.out.println(primes);
			
			System.out.println(list6);
			System.out.println(list6.stream().limit(7).reduce((i,j)->i+j).get());
			//list6.stream().reduce((t,u)->t+10);
			
			Map<Integer,String> names=new HashMap<Integer,String>();
			names.put(1,"Virat");
			names.put(2,"Kohli");
			System.out.println(names);
			names.forEach((i,j)->System.out.println(i+"  "+j));
			Set<Integer> set=new HashSet<Integer>();
			set.add(1);
			set.add(2);
			set.forEach(i-> System.out.println(i));
			
	}

	private static void method3(Predicate<Integer> p3, int[] x) {
		for(int i:x) {
			if(p3.test(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static void method1(MyInteface m) {
		// TODO Auto-generated method stub
		//m.findSquare(5,6);
		System.out.println(m.findSquare(5,6));
		//m.letc();
	}
	public static boolean isDivisible(int i) {
		return i%5==0;
	}
	public static int mapDouble(int i) {
		return i*2;
	}

}
