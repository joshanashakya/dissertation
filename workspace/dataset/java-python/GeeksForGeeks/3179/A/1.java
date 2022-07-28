

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
      
// Iterative Function to calculate (x^y) in O(log y) 
static long power(int x, long y) 
{ 
  
    // Initialize result 
    long res = 1; 
  
    while (y > 0) 
    { 
  
        // If y is odd, multiply x with result 
        if (y==1) 
            res = (res * x); 
  
        // y must be even now 
        // y = y / 2 
        y = y >> 1; 
        x = (x * x); 
    } 
    return res; 
} 
  
// Function to return the count  
// of required trees 
static long solve(int L) 
{ 
    // number of nodes 
    int n = L / 2 + 1; 
  
    long ans = power(n, n - 2); 
  
    // Return the result 
    return ans; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
  
    int L = 6; 
    System.out.println (solve(L)); 
} 
} 
  
// This code is contributed by ajit.  

