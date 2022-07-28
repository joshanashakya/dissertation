

// Java code for calculating  
// the number of squares 
import java.io.*; 
  
class GFG 
{ 
    // Recursive function to 
    // return gcd of a and b 
    static int __gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0 || b == 0) 
        return 0; 
      
        // base case 
        if (a == b) 
            return a; 
      
        // a is greater 
        if (a > b) 
            return __gcd(a - b, b); 
        return __gcd(a, b - a); 
    }  
  
  
// Function to find  
// number of squares 
static int NumberOfSquares(int x,  
                           int y) 
{ 
    // Here in built c++  
    // gcd function is used 
    int s = __gcd(x, y); 
  
    int ans = (x * y) / (s * s); 
  
    return ans; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int m = 385, n = 60; 
  
    // Call the function 
    // NumberOfSquares 
    System.out.println(NumberOfSquares(m, n)); 
} 
} 
  
// This code is contributed by anuj_67. 

