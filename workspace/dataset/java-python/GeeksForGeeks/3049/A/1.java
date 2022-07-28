

// Java program to find first and  
// last  digits of a number 
import java.math.*; 
  
class GFG { 
      
    // Find the first digit 
    static int firstDigit(int n) 
    { 
        // Find total number of digits - 1 
        int digits = (int)(Math.log10(n)); 
      
        // Find first digit 
        n = (int)(n / (int)(Math.pow(10, digits))); 
      
        // Return first digit 
        return n; 
    } 
      
    // Find the last digit 
    static int lastDigit(int n) 
    { 
        // return the last digit 
        return (n % 10); 
    } 
      
    // Driver program 
    public static void main(String args[]) 
    { 
        int n = 98562; 
        System.out.println(firstDigit(n) + 
                           " " + lastDigit(n)); 
    } 
} 
  
  
// This code is contributed by Nikita Tiwari. 

