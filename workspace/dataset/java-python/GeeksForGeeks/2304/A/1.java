

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
      
// Function that returns the maximum product of 
// digits among numbers less than or equal to N 
static int maxProd(int N) 
{ 
    if (N == 0) 
        return 1; 
    if (N < 10) 
        return N; 
    return Math.max(maxProd(N / 10) * (N % 10), 
            maxProd(N / 10 - 1) * 9); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int N = 390; 
    System.out.println (maxProd(N)); 
} 
} 
  
// This code is contributed by ajit. 

