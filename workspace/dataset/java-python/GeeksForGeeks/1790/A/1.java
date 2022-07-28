

// Java Program to find the sum of fourth powers of 
// first n even natural numbers 
  
import java.io.*; 
  
class GFG { 
      
    // calculate the sum of fourth power of first  
    // n even natural numbers 
    static long evenPowerSum(int n) 
    { 
        long sum = 0; 
        for (int i = 1; i <= n; i++) 
        { 
      
            // made even number 
            int j = 2 * i; 
            sum = sum + (j * j * j * j); 
        } 
          
        return sum; 
    } 
  
    // Driven Program 
    public static void main (String[] args) { 
          
        int n = 5; 
        System.out.println(evenPowerSum(n)); 
    } 
} 
  
/*This code is contributed by vt_m.*/

