package com.guopingwu;

public class StringPerformance {

	public static void main(String[] args) {
		 long startTime = System.currentTimeMillis();
		 String s1 ;
         String s2;
	      for(int i=0;i<200000;i++) {
	        s1 = "hello";
	        s2 = "hello"; 
	      }
	      long endTime = System.currentTimeMillis();
	      System.out.println("Time taken for creation" 
	         + " of String literals : "+ (endTime - startTime) 
	         + " milli seconds" );   
	      
	      
	      String s3 ;
	      String s4 ;
	      long startTime1 = System.currentTimeMillis();	      
	      for(int i=0;i<200000;i++) {
	         s3 = new String("hello");
	         s4 = new String("hello");
	      }
	      long endTime1 = System.currentTimeMillis();
	      System.out.println("Time taken for creation" 
	         + " of String objects : " + (endTime1 - startTime1)
	         + " milli seconds");
	   }


}
