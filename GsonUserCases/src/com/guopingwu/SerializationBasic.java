package com.guopingwu;

import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException;  

import com.google.gson.Gson; 
import com.google.gson.GsonBuilder;  

 public class SerializationBasic  { 
   
   public static void main(String args[]) { 
	  SerializationBasic tester = new SerializationBasic(); 
      try { 
         Student student = new Student(); 
         student.setAge(4); 
         student.setName("Guoping"); 
         tester.writeJSON(student);  
         Student student1 = tester.readJSON(); 
         System.out.println(student1); 
      } 
      catch(FileNotFoundException e) { 
         e.printStackTrace(); 
      } 
      catch(IOException e) { 
         e.printStackTrace();
      } 
   } 
   private void writeJSON(Student student) throws IOException { 
      GsonBuilder builder = new GsonBuilder(); 
      Gson gson = builder.create(); 
      FileWriter writer = new FileWriter("student.json");   
      writer.write(gson.toJson(student));   
      writer.close(); 
   }  
   private Student readJSON() throws FileNotFoundException { 
      GsonBuilder builder = new GsonBuilder(); 
      Gson gson = builder.create(); 
      BufferedReader bufferedReader = new BufferedReader(
         new FileReader("student.json"));   
      
      Student student = gson.fromJson(bufferedReader, Student.class); 
      return student; 
   } 
}

   class Student { 
      private String name; 
      private int age; 
      public Student(){
    	  
      } 
   
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
   
