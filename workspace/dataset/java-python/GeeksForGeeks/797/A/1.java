

// Java program to find the count 
// of natural numbers upto a 
// given number of digits  
// that contain atleast one zero 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    // Utility function to calculate  
    // the count of natural numbers 
    // upto a given number of digits  
    // that contain atleast one zero 
    static int findCountUpto(int d) 
    { 
        // Sum of two GP series 
        int GP1_Sum = 9 * ((int)((Math.pow(10, d)) - 1) / 9); 
        int GP2_Sum = 9 * ((int)((Math.pow(9, d)) - 1) / 8); 
      
        return GP1_Sum - GP2_Sum; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int d = 1; 
        System.out.println(findCountUpto(d)); 
          
        d = 2; 
        System.out.println(findCountUpto(d)); 
          
        d = 4; 
        System.out.println(findCountUpto(d)); 
          
    } 
} 
  
  
/* This code is contributed by Nikita Tiwari.*/

