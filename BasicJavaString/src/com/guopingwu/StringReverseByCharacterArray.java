package com.guopingwu;

public class StringReverseByCharacterArray {

	public static void main(String[] args) {
		 String input = "1234567890";
	      char[] try1 = input.toCharArray();
	      int middle = (try1.length-1)/2;
	      char temp;
	      for (int i=0; i <= middle; i++) {
	    	  temp = try1[i];
	    	  try1[i] = try1[try1.length-1-i];
	    	  try1[try1.length-1-i] = temp;	  
	      }	
	      String output = new String(try1);
	      System.out.println("input = " + input);
	      System.out.println( "output = " + output);
	}
}
