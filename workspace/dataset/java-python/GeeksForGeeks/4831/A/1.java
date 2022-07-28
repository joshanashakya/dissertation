

// Java implementation of the above approach 
  
import java.io.*; 
  
class GFG { 
  
  
static void printPermutation(int n, int k) 
{ 
    int i, mx = n; 
    for (i = 1; i <= k; i++) // Decreasing part 
    { 
        System.out.print( mx + " "); 
        mx--; 
    } 
    for (i = 1; i <= mx; i++) // Increasing part 
        System.out.print( i + " "); 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
            int N = 5, K = 3; 
  
    if (K >= N - 1) 
        System.out.print( "Not Possible"); 
  
    else
        printPermutation(N, K); 
    } 
} 
  
// This code is contributed by inder_verma.. 

