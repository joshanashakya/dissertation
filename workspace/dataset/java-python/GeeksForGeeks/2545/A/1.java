

// Java Program to find sum of product of 
// r and rth Binomial Coefficient i.e  
// summation r * nCr 
import java.io.*; 
  
class GFG { 
  
    static int MAX = 100; 
      
    // Return summation of r * nCr 
    static int summation(int n) 
    { 
        return n << (n - 1); 
    } 
      
    // Driven Program 
    public static void main (String[] args) 
    { 
        int n = 2; 
        System.out.println( summation(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

