package com.guopingwu;

public class StringReplace {

	public static void main(String[] args) {
		 String str = "Hello World Hello World";
	      System.out.println( str.replace( 'H','W' ) );
	      System.out.println( str.replaceFirst("He", "Wa") );
	      System.out.println( str.replaceAll("He", "Ha") );
	}
}
