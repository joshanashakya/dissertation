

// Java program to find the  
// minimum cost required to  
// reach the n-th floor  
// space-optimized solution 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
// function to find  
// the minimum cost 
// to reach N-th floor 
static int minimumCost(int cost[], int n) 
{ 
    int dp1 = 0, dp2 = 0; 
  
    // traverse till N-th stair 
    for (int i = 0; i < n; i++)  
    { 
        int dp0 = cost[i] +  
                  Math.min(dp1, dp2); 
  
        // update the last  
        // two stairs value 
        dp2 = dp1; 
        dp1 = dp0; 
    } 
    return Math.min(dp1, dp2); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int a[] = { 2, 5, 3, 1, 7, 3, 4 }; 
    int n = a.length; 
    System.out.print(minimumCost(a, n)); 
} 
} 

