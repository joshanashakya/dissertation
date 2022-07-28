

// Java Program to find Nth term 
  
import java.lang.*; 
import java.lang.Math; 
import java.io.*; 
  
class GFG { 
    // Function that will return nth term 
static double getValue(double n) 
{ 
    // Find log of n+1 on base 2 
 double result =(Math.floor(Math.log(n + 1) / Math.log(2))); 
  
    return Math.pow(2, result); 
} 
  
// Driver Code 
    public static void main (String[] args) { 
    // Get n 
    double n = 9; 
    // Get the value 
    System.out.println (getValue(n)); 
    // Get n 
    n = 1025; 
    // Get the value 
        System.out.println (getValue(n)); 
    } 
} 

