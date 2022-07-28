

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to return the value of nCr 
static int nCr(int n, int r) 
{ 
  
    // Initialize the answer 
    int ans = 1; 
  
    for (int i = 1; i <= r; i += 1)  
    { 
  
        // Divide simultaneously by 
        // i to avoid overflow 
        ans *= (n - r + i); 
        ans /= i; 
    } 
    return ans; 
} 
  
// Function to return the count of ways 
static int total_ways(int N, int X) 
{ 
    return (nCr(N - 1, X - 1) + nCr(N - 1, X)); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int N = 5, X = 3; 
      
    System.out.println (total_ways(N, X)); 
} 
} 
  
// This code is contributed by Sachin 

