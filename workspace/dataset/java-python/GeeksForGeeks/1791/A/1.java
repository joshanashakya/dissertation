

// JAVA Program to find the sum of fourth powers of 
// first n even natural numbers 
  
import java.io.*; 
  
class GFG { 
          
    // calculate the sum of fourth power of first n  
    // even natural numbers 
    static long evenPowerSum(int n) 
    { 
        return (8 * n * (n + 1) * (2 * n + 1) *  
                   (3 * n * n + 3 * n - 1)) / 15; 
    } 
      
    // Driven Program 
    public static void main (String[] args) { 
          
        int n = 4; 
        System.out.println(evenPowerSum(n)); 
    } 
} 
  
/* This code is contributed by vt_m. */

