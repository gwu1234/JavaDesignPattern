package com.guopingwu;

import java.util.ArrayList;

// ArrayList works only for objects, not for primitive  (int, float, double etc.) 
// need Wrapper class for these primitives:

// Primitive	Wrapper Class
// boolean	Boolean	
// byte	Byte
// char	Character	
// int	Integer	
// float	Float
// double	Double	
// long	Long	
// short	Short

// we use Integer as an example
public class ArrayListBoxing {

    public static void main(String[] args) {
	    
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i = 0; i< 1000; i++) {
            intArrayList.add(i); // auto boxing here 
        }

        for(int i=0; i<intArrayList.size(); i++) {
            System.out.println("position at " + i + "  = " + intArrayList.get(i).intValue());
        }

    }
}
    
 