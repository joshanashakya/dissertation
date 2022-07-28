

// Java implementation of the approach 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
public class GFG { 
  
    // Function to return the nth term of the given series 
    static int nthTerm(int n) 
    { 
  
        // Common difference and first term 
        int d = 2, a1 = 0; 
  
        // nth term 
        int An = a1 + (n - 1) * d; 
  
        // nth term of the given series 
        return (int)Math.pow(An, 3); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 5; 
        System.out.println(nthTerm(n)); 
    } 
} 

