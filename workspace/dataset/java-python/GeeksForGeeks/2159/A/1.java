

// Java program to count number of odd squares 
// in given range [n, m] 
  
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
    public static int countOddSquares(int n, int m) 
    { 
        return (int)Math.pow((double)m,0.5) - (int)Math.pow((double)n-1,0.5); 
    } 
    // Driver code for above functions 
    public static void main (String[] args) 
    { 
        int n = 5, m = 100; 
        System.out.print("Count is " + countOddSquares(n, m)); 
    } 
} 
// Mohit Gupta_OMG <(o_0)> 

