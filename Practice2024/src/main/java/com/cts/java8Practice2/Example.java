package com.cts.java8Practice2;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Parser p=new Parser();
		String str="Aru";
		MyPrinter mp=new MyPrinter();
		/*
		 * mp.print(str,new Parser() {
		 * 
		 * 
		 * public String parse(String str) { // TODO Auto-generated method stub return
		 * StringParser.convert(str); }
		 * 
		 * });
		 */
		mp.print(str,(s->StringParser.convert(s)));
		mp.print(str,(StringParser::convert));
		
	}

}
