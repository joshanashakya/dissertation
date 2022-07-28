

// Java program to compute sum of 
// digits in numbers from 1 to n 
import java.io.*; 
  
class GFG { 
      
    // Returns sum of all digits 
    // in numbers from 1 to n 
    static int countNumbersWith4(int n) 
    { 
        // initialize result 
        int result = 0; 
       
        // One by one compute sum of digits 
        // in every number from 1 to n 
        for (int x=1; x<=n; x++) 
            result += has4(x)? 1 : 0; 
       
        return result; 
    } 
      
    // A utility function to compute sum 
    // of digits in a given number x 
    static boolean has4(int x) 
    { 
        while (x != 0) 
        { 
            if (x%10 == 4) 
               return true; 
            x   = x /10; 
        } 
        return false; 
    } 
       
    // Driver Program 
    public static void main(String args[]) 
    { 
       int n = 328; 
       System.out.println("Count of numbers from 1 to "
                          + " that have 4 as a a digit is "
                          + countNumbersWith4(n)) ; 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

