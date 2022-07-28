

// Java Program to find sum of harmonic series 
import java.io.*; 
  
class GFG { 
      
    // Function to return sum of 
    // harmonic series 
    static double sum(int n) 
    { 
      double i, s = 0.0; 
      for (i = 1; i <= n; i++) 
          s = s + 1/i; 
      return s; 
    } 
   
     
    // Driven Program 
    public static void main(String args[]) 
    { 
        int n = 5; 
        System.out.printf("Sum is %f", sum(n));         
    } 
} 

