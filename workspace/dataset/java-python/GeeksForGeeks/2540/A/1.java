

// Java program to find sum of  
// product of x and y such that 
// n / x = y (Integer Division) 
import java.io.*; 
  
class GFG { 
      
// Return the sum of natural number in a range. 
static int sumOfRange(int a, int b) 
{ 
    // n * (n + 1) / 2. 
    int i = (a * (a + 1)) >> 1; 
    int j = (b * (b + 1)) >> 1; 
    return (i - j); 
} 
  
// Return the sum of product x*y. 
static int sumofproduct(int n) 
{ 
    int sum = 0; 
  
    // Iterating i from 1 to sqrt(n) 
    int root = (int)Math.sqrt(n); 
    for (int i = 1; i <= root; i++) 
    { 
        // Finding the upper limit. 
        int up = n / i; 
  
        // Finding the lower limit. 
        int low = Math.max(n / (i + 1), root); 
  
        sum += (i * sumOfRange(up, low)); 
        sum += (i * (n / i)); 
    } 
  
    return sum; 
} 
  
    // Driver Code 
    static public void main(String[] args) 
    { 
        int n = 10; 
        System.out.println(sumofproduct(n)); 
    } 
} 
  
// This code is contributed by vt_m. 

