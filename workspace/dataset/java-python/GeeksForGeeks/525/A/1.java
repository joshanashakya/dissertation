

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to check whether the product 
// of integers of the range [a, b] 
// is positive, negative or zero 
static void solve(long a, long b) 
{ 
  
    // If both a and b are positive then 
    // the product will be positive 
    if (a > 0 && b > 0)  
    { 
        System.out.println( "Positive"); 
    } 
  
    // If a is negative and b is positive then 
    // the product will be zero 
    else if (a <= 0 && b >= 0) 
    { 
        System.out.println( "Zero" ); 
    } 
  
    // If both a and b are negative then 
    // we have to find the count of integers 
    // in the range 
    else 
    { 
  
        // Total integers in the range 
        long n = Math.abs(a - b) + 1; 
  
        // If n is even then the resultant 
        // product is positive 
        if (n % 2 == 0)  
        { 
            System.out.println( "Positive"); 
        } 
          
        // If n is odd then the resultant 
        // product is negative 
        else
        { 
            System.out.println( "Negative"); 
        } 
    } 
} 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int a = -10, b = -2; 
      
        solve(a, b); 
    } 
} 
  
// This code is contributed by anuj_67.. 

