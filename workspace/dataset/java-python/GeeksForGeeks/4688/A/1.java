

// Java program to get  
// the sum of the series 
import java.util.*; 
import java.lang.*; 
  
class GFG  
{ 
    // Function calculating  
    // the series 
    public static int summation(int n) 
    { 
        return (n * (n + 1) *  
               (2 * n + 1)) / 6; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        System.out.println(summation(n)); 
    } 
} 
  
// This code is contributed 
// by Sachin Bisht 

