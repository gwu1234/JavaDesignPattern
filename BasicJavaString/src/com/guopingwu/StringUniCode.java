package com.guopingwu;

public class StringUniCode {
	   public static void main(String[] args) {
		      String test_string = "welcome to TutorialsPoint";
		      System.out.println("String under test is = "+test_string);
		      
		      System.out.println("Unicode code point at" 
		         +" position 5 in the string is = "
		         +  test_string.codePointBefore(5));
		   }
}
