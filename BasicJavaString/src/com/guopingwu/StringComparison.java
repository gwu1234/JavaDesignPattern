package com.guopingwu;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
	      String anotherString = "Hello WorlD";
	      Object objStr = str;

	      System.out.println( str.compareTo(anotherString) );
	      System.out.println( str.compareToIgnoreCase(anotherString) );
	      System.out.println( str.compareTo(objStr.toString()));

	}

}
