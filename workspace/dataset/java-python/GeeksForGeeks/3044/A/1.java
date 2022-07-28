

// Java Program to find the 
// sum of forth powers of 
// first n natural numbers 
import java.io.*; 
import java.util.*; 
  
class GFG { 
      
    // Return the sum of  
    // forth power of first 
    // n natural numbers 
    static long fourthPowerSum(int n) 
    { 
        return ((6 * n * n * n * n * n) +  
                (15 * n * n * n * n) +  
                (10 * n * n * n) - n) / 30; 
    } 
      
    public static void main (String[] args)  
    { 
        int n = 6; 
          
        System.out.println(fourthPowerSum(n));  
      
    } 
} 
  
// This code is contributed by Gitanjali. 

