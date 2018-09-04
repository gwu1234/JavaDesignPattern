package com.guopingwu;

public class StringReverseByStringBuilder {

	public static void main(String[] args) {
		String string = "abcdefghijk";
	      String reverse = (new StringBuilder(string)).reverse().toString();
	      System.out.println("\nString before reverse: "+string);
	      System.out.println("String after reverse: "+reverse);
	}
}
