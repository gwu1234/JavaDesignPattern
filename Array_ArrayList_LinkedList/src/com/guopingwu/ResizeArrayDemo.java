package com.guopingwu;

// in Java, all object variables are references. 
// However, Java doesn't pass method arguments by reference; 
// it passes them by value
// This means the references passed to the method are actually 
// copies of the original references

public class ResizeArrayDemo {
	
 public static void main(String[] args) {
	 
 	 ResizedArray ra = new ResizedArray();
	 System.out.println("original array");
     printArray(ra.baseData);
    
     System.out.println("increase array size"); 
     ra.resizeArray(20);
     printArray(ra.baseData);
     
     System.out.println("decrease array size");  
     ra.resizeArray(5);
     printArray(ra.baseData);
 }


 // just for console printing
 public static void printArray(int[] arr)
 {
     for(int i = 0; i < arr.length; i++)
         System.out.print(arr[i] + " ");
     System.out.println();
 }
} 
 
class ResizedArray{
	// initial array: 10 elements 
	public int baseData[] = new int[] {10,20,30,40,50,60,71,80,90,100};
	
    // increase or decrease array elements 
	// newSize > 0 
    public void resizeArray(int newSize)
    {
    	if (newSize <= 0) {
    		return ;
    	}
 	    // create a new array reference and storage
        int[] newData = new int[newSize];

        
        int count = baseData.length;
        
        // array size decreased
        if (newSize < baseData.length) {
        	count = newSize;
        	// copy the data 
        	for (int i = 0; i < count; i++) {
                newData[i] = baseData[i];
             }
        }
        // array size increased
        else {
        	// copy the data 
            for (int i = 0; i < count; i++) {
                newData[i] = baseData[i];
             }
     
             // add new data 
             for (int i = baseData.length; i < newSize; i++) {
                newData[i] = 999;
             }
        }
        
        // point the original array reference to the new array storage 
        baseData = newData;
   }   
}

