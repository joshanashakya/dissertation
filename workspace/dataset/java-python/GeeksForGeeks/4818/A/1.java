

// Program to find weighted mean of first 
// n natural numbers using formula. 
import java.io.*; 
  
public class GFG { 
      
    // Returns weighted mean assuming for numbers 
    // {1, 2, ..n} and weights {1, 2, .. n} 
    static int weightedMean(int n) 
    { 
        return (2 * n + 1)/3; 
    } 
      
    // Driver program to test the function. 
  
    static public void main (String[] args) 
    { 
        int n = 10; 
          
        System.out.println(weightedMean(n)); 
      
    } 
} 
  
// This code is contributed by vt_m. 

