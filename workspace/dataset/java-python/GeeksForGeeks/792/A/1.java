

// Java  implementation of the approach 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to return the required sum 
static long getSum(long n, int d) 
{ 
    if (n < d) 
        return 0; 
  
    // Decrement N 
    while (n % 10 != d) 
        n--; 
  
    long k = n / 10; 
  
    return (k + 1) * d + (k * 10 + 10 * k * k) / 2; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
     long n = 30; 
    int d = 3; 
    System.out.println(getSum(n, d));    } 
} 
//This code is contributed by inder_verma.. 

