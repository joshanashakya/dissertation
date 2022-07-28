

// Java Program to check if a number can 
// be expressed as sum of five consecutive 
// integers. 
import java.io.*; 
  
class GFG { 
  
    // function to check if a number can be  
    // expressed as sum of five consecutive  
    // integers. 
    static void checksum(int n) 
    { 
        // if n is 0 
        if (n == 0) { 
            System.out.println("-2 -1 0 1 2"); 
            return; 
        } 
      
        int inc; 
      
        // if n is positive, increment loop by 1. 
        if (n > 0) 
            inc = 1; 
      
        // if n is negative, decrement loop by 1. 
        else
            inc = -1; 
      
        // Running loop from 0 to n - 4 
        for (int i = 0; i <= n - 4; i += inc) { 
      
            // check if sum of five consecutive 
            // integer is equal to n. 
            if (i + i + 1 + i + 2 + i + 3 + i  
                                       + 4 == n)  
            { 
                System.out.print( (i ) 
                        + " " + (i + 1) 
                        + " " + (i + 2) 
                        + " " + (i + 3) 
                        + " " + (i + 4)); 
                return; 
            } 
        } 
      
        System.out.println( "-1"); 
    } 
      
    // Driver Program 
    public static void main (String[] args)  
    { 
        int n = 15; 
        checksum(n); 
    } 
} 
  
// This code is contributed by anuj_67 

