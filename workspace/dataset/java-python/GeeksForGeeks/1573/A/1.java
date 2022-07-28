

// Java program to find LCM of 2 numbers 
// without using GCD 
import java.io.*; 
import java.lang.*; 
  
class GfG { 
      
    // Function to return LCM of two numbers 
    public static int findLCM(int a, int b) 
    { 
        int lar = Math.max(a, b); 
        int small = Math.min(a, b); 
        for (int i = lar; ; i += lar) { 
            if (i % small == 0) 
                return i; 
        } 
    } 
      
    // Driver program to test above function 
    public static void main(String [] argc) 
    { 
        int a = 5, b = 7; 
        System.out.println( "LCM of " + a + " and "
            + b + " is " + findLCM(a, b)); 
          
    } 
} 
  
// This dose is contributed by Sagar Shukla. 

