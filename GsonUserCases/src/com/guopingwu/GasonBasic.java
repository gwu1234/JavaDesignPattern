package com.guopingwu;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GasonBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String jsonString = "{\"name\":\"Guoping\", \"age\":3}"; 
	      
	      GsonBuilder builder = new GsonBuilder(); 
	      builder.setPrettyPrinting(); 
	      
	      Gson gson = builder.create(); 
	      Student student = gson.fromJson(jsonString, Student.class); 
	      System.out.println(student);    
	      
	      jsonString = gson.toJson(student); 
	      System.out.println(jsonString);  
	}
	
	private class Student { 
		   private String name; 
		   private int age; 
		   public Student(){} 
		   
		   public String getName() { 
		      return name; 
		   } 
		   public void setName(String name) { 
		      this.name = name; 
		   } 
		   public int getAge() { 
		      return age; 
		   } 
		   public void setAge(int age) { 
		      this.age = age; 
		   } 
		   public String toString() { 
		      return "Student [ name: "+name+", age: "+ age+ " ]"; 
		   }  	
	}
}
