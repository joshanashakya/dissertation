

// Java Program to find the 
// sum of forth powers of  
// first n natural numbers 
import java.io.*; 
import java.util.*; 
  
class GFG { 
      
    // Return the sum of forth 
    // power of first n natural 
    // numbers 
    static long fourthPowerSum(int n) 
    { 
        long sum = 0; 
          
        for (int i = 1; i <= n; i++)  
            sum = sum + (i * i * i * i); 
          
        return sum; 
    } 
      
    public static void main (String[] args)  
    { 
        int n = 6; 
        System.out.println(fourthPowerSum(n));  
      
    } 
} 
  
// This code is contributed by Gitanjali. 

