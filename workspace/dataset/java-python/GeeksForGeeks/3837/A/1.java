

// Java implementation of above approach 
  
import java.io.*; 
  
class GFG { 
      
  
  
// Function to find the value of F(n) 
static long findF_N(long n) 
{ 
  
    long ans = 0; 
    for (long i = 0; i < n; ++i) 
        ans += (i + 1) * (n - i - 1); 
  
    return ans; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            long n = 3; 
    System.out.println( findF_N(n)); 
    } 
} 
// This code is contributed by anuj_67.. 

