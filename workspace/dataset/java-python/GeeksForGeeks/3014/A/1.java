

// Java Program to find the 
// sum of fourth powers of 
// first n odd natural numbers 
import java.io.*; 
  
class GFG { 
  
    // calculate the sum of 
    // fourth power of first 
    // n odd natural numbers 
    static long oddNumSum(int n) 
    { 
        int j = 0; 
        long sum = 0; 
        for (int i = 1; i <= n; i++) { 
            j = (2 * i - 1); 
            sum = sum + (j * j * j * j); 
        } 
        return sum; 
    } 
  
    // Driven Program 
    public static void main(String args[]) 
    { 
        int n = 6; 
        System.out.println(oddNumSum(n)); 
    } 
} 
  
// This code is contributed 
// by Nikita tiwari. 

