

// JAVA Code to check if a number 
// can be written as sum of  
// three consecutive integers. 
import java.util.*; 
  
class GFG  
{ 
    // function to check if a number 
    // can be written as sum of 
    // three consecutive integer. 
    static void checksum(int n) 
    { 
        // if n is 0 
        if (n == 0) { 
            System.out.println("-1 0 1"); 
            return; 
        } 
       
        int inc; 
       
        // if n is positive,  
        // increment loop by 1. 
        if (n > 0) 
            inc = 1; 
       
        // if n is negative,  
        // decrement loop by 1. 
        else
            inc = -1; 
       
        // Running loop from 0 to n - 2 
        for (int i = 0; i <= n - 2; i += inc) { 
       
            // check if sum of three consecutive 
            // integer is equal to n. 
            if (i + i + 1 + i + 2 == n) { 
                System.out.println(i + " " +  
                                  (i + 1) + 
                                " " + (i + 2)); 
                return; 
            } 
        } 
       
        System.out.println("-1"); 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int n = 6; 
        checksum(n); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal. 

