

// Java program to check if 
// square root of a number 
// under modulo p exists or not 
import java.io.*; 
  
class GFG 
{ 
      
// Utility function to do 
// modular exponentiation. 
// It returns (x^y) % p. 
static int power(int x, int y, int p) 
{ 
    int res = 1;     // Initialize result 
    x = x % p; // Update x if it is more  
               // than or equal to p 
  
    while (y > 0) 
    { 
        // If y is odd, multiply 
        // x with result 
        if ((y & 1) == 0) 
            res = (res * x) % p; 
  
        // y must be even now 
        y = y >> 1; // y = y/2 
        x = (x * x) % p; 
    } 
    return res; 
} 
  
// Returns true if there 
// exists an integer x such  
// that (x*x)%p = n%p 
static boolean squareRootExists(int n,  
                                int p) 
{ 
    // Check for Euler's criterion  
    // that is [n ^ ((p-1)/2)] % p 
    // is 1 or not. 
    if (power(n, (p - 1) / 2, p) == 1) 
    return true; 
  
    return false; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int p = 7; 
    int n = 2; 
    if(squareRootExists(n, p)) 
        System.out.println ("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by ajit  

