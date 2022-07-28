

// Java Program to find the sum of fifth power 
// of first n natural numbers 
import java.io.*; 
  
class GFG { 
      
    // calculate the sum of fifth power 
    //of first n natural numbers 
    static long fifthPowerSum(int n) 
    { 
        return ((2 * n * n * n * n * n * n) + 
            (6 * n * n * n * n * n) +  
            (5 * n * n * n * n) - 
            (n * n)) / 12; 
    } 
      
    // Driven Program 
    public static void main(String args[]) 
    { 
        int n = 5; 
        System.out.println(fifthPowerSum(n)); 
    } 
} 
  
 /*This code is contributed by Nikita Tiwari.*/

