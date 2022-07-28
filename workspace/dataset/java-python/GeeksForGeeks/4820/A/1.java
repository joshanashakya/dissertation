

// A formula based Java program to find sum 
// of series with cubes of first n natural 
// numbers 
  
import java.util.*; 
import java.lang.*; 
class GFG { 
    /* Returns the sum of series */
    public static int sumOfSeries(int n) 
    { 
        int x = (n * (n + 1) / 2); 
  
        return x * x; 
    } 
  
    // Driver Function 
    public static void main(String[] args) 
    { 
        int n = 5; 
        System.out.println(sumOfSeries(n)); 
    } 
} 
  
// Code Contributed by Mohit Gupta_OMG <(0_o)> 

