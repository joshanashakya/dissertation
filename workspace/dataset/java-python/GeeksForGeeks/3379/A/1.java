

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
static int mod = 1000000007; 
  
// Function to return no of ways to build a binary  
// string of length N such that 0s always occur  
// in groups of size K 
static int noOfBinaryStrings(int N, int k) 
{ 
    int dp[] = new int[100002]; 
    for (int i = 1; i <= k - 1; i++)  
    { 
        dp[i] = 1; 
    } 
  
    dp[k] = 2; 
  
    for (int i = k + 1; i <= N; i++)  
    { 
        dp[i] = (dp[i - 1] + dp[i - k]) % mod; 
    } 
  
    return dp[N]; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int N = 4; 
    int K = 2; 
    System.out.println(noOfBinaryStrings(N, K)); 
} 
} 
  
// This code contributed by Rajput-Ji 

