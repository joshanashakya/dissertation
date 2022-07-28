

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the count 
// of required arrangements 
static int countWays(int n) 
{ 
    // Create the dp array 
    int []dp = new int[n + 1]; 
  
    // Initialize the base cases 
    // as explained above 
    dp[0] = 0; 
    dp[1] = 1; 
  
    // (12) as the only possibility 
    dp[2] = 1; 
  
    // Generate answer for greater values 
    for (int i = 3; i <= n; i++) 
    { 
        dp[i] = dp[i - 1] + dp[i - 3] + 1; 
    } 
  
    // dp[n] contains the desired answer 
    return dp[n]; 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int n = 6; 
    System.out.println(countWays(n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

