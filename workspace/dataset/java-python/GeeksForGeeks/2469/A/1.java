

// Java program to find N-th 
// term of the series: 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG { 
  
    // function to return nth term of the series 
    static long NthTerm(long n) 
    { 
        long x = (3 * n * n) % 1000000009; 
        return (x - n + 1000000009) % 1000000009; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
  
        // Taking  n as 4 
        long N = 4; 
  
        // Printing the nth term 
        System.out.println(NthTerm(N)); 
    } 
} 

