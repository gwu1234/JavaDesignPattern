package com.guopingwu;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
public @interface MyAnnotation {
	int value(); 
}
