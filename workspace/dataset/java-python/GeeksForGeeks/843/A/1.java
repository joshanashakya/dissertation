

// Java implementation for the above approach 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
      
    // Function to returns factorial of n 
    static int factorial(int n)  
    {  
        if (n <= 1)  
            return 1;  
        return n * factorial(n - 1);  
    }  
      
    // Function to find nCr  
    static int nCr(int n, int r)  
    {  
        return factorial(n) / (factorial(n - r) * 
                               factorial(r));  
    }  
      
    // Function to find the number of ways 
    // to arrange 2*N persons  
    static int NumberOfWays(int n, int x, int y)  
    {  
        return nCr(2 * n - x - y, n - x) *  
               factorial(n) * factorial(n);  
    }  
      
    // Driver code 
    public static void main (String[] args) 
                  throws java.lang.Exception 
    { 
        int n = 5, x = 4, y = 2;  
          
        // Function call  
        System.out.println(NumberOfWays(n, x, y));          
    } 
} 
  
// This code is contributed by Nidhiva 

