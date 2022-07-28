

// Java program to count numbers  
// from 1 to n with 0 as a digit 
import java.io.*; 
  
class GFG { 
      
    // Returns 1 if x has 0, else 0 
    static int has0(int x) 
    { 
        // Traverse througn all digits 
        // of x to check if it has 0. 
        while (x != 0) 
        { 
            // If current digit is 0, 
            // return true 
            if (x % 10 == 0) 
            return 1; 
      
            x /= 10; 
        } 
      
        return 0; 
    } 
      
    // Returns count of numbers 
    // from 1 to n with 0 as digit 
    static int getCount(int n) 
    { 
        // Initialize count of  
        // numbers having 0 as digit 
        int count = 0; 
      
        // Travers through all numbers 
        // and for every number 
        // check if it has 0. 
        for (int i = 1; i <= n; i++) 
            count += has0(i); 
      
        return count; 
    } 
  
      
// Driver program 
public static void main(String args[]) 
{ 
  int n = 107; 
  System.out.println("Count of numbers from 1"
            + " to " +n + " is " + getCount(n)); 
} 
} 
  
// This code is contributed by Nikita Tiwari. 

