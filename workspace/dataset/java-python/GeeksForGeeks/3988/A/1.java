

// JAVA Code For Smallest number divisible by 
// n and has at-least k trailing zeros 
import java.util.*; 
  
class GFG { 
      
     // Function to find gcd 
     static long gcd(long a, long b) 
        { 
            // Everything divides 0  
            if (a == 0 || b == 0) 
               return 0; 
            
            // base case 
            if (a == b) 
                return a; 
            
            // a is greater 
            if (a > b) 
                return gcd(a-b, b); 
            return gcd(a, b-a); 
        } 
  
    // Function to compute the rounded value 
    public static long getRounding(long n, long k) 
    { 
        long rounding = (long)Math.pow(10, k); 
       
        // Computing GCD 
        long result = gcd(rounding, n); 
       
        // Returning LCM (GCD * LCM = n * k) 
        return ((rounding * n) / result); 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        long n = 375, k = 4; 
           
        // Function call 
        System.out.println( getRounding(n, k)); 
          
    } 
} 
    
// This code is contributed by Arnav Kr. Mandal. 

