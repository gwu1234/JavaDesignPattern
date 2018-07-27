package com.guopingwu;

import com.google.gson.Gson;  

public class DataBinding { 
   public static void main(String args[]) { 
      Gson gson = new Gson(); 
      Employee employee = new Employee (); 
      employee.setAge(99); 
      employee.setName("Guoping"); 
      
      String jsonString = gson.toJson(employee);          
      System.out.println(jsonString); 
      
      Employee employee1 = gson.fromJson(jsonString, Employee.class); 
      System.out.println(employee1); 
   }   
}

class Employee { 
   private String name; 
   private int age; 
   public Employee (){} 
   
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
      return "Employee [ name: "+name+", age: "+ age+ " ]"; 
   }  
 } 
