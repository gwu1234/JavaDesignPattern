package com.guopingwu;

import java.lang.reflect.Method;

public class TestAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		Hello h=new Hello();  
		Method m=h.getClass().getMethod("sayHello");  
		  
		MyAnnotation manno=m.getAnnotation(MyAnnotation.class);  
		System.out.println("value is: "+manno.value());  
	}

}
