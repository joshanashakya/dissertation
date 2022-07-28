

// Java Program to find the  
// sum of fifth  powers of  
// first n natural numbers 
import java.io.*; 
  
class GFG  
{ 
    // calculate the sum of fifth 
    // power of first n natural  
    // numbers 
    static long fifthPowerSum(int n) 
    { 
        long sum = 0; 
        for (int i = 1; i <= n; i++) 
            sum = sum + (i * i * i * i * i); 
        return sum; 
    } 
      
    // Driven Program 
    public static void main(String args[]) 
    { 
        int n = 6; 
        System.out.println(fifthPowerSum(n)); 
    } 
} 
  
// This code is contributed by  
// Nikita Tiwari. 

