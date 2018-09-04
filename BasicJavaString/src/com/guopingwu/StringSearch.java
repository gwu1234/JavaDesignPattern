package com.guopingwu;

public class StringSearch {
	 public static void main(String[] args) {
	     searchByIndex(); 
	     searchByContain();
	   }
	 
	 public static void searchByIndex() {
		 String strOrig = "Hello readers";
	      int intIndex = strOrig.indexOf("rea");
	      
	      if(intIndex == - 1) {
	         System.out.println("Hello not found");
	      } else {
	         System.out.println("Found Hello at index " + intIndex);
	      }
	 }
	 
	 public static void searchByContain() {
		 String text = "The cat is on the table";
		 boolean contain = text.contains("table");
	     System.out.println(contain);
	 }
}
