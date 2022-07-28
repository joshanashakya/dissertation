

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the maximum possible 
// sum after performing the given operation 
static int max_sum(int a[], int n) 
{ 
    // Dp vector to store the answer 
    int [][]dp = new int[n + 1][2]; 
                          
    // Base value 
    dp[0][0] = 0; dp[0][1] = -999999; 
  
    for (int i = 0; i <= n - 1; i++)  
    { 
        dp[i + 1][0] = Math.max(dp[i][0] + a[i], 
                                dp[i][1] - a[i]); 
        dp[i + 1][1] = Math.max(dp[i][0] - a[i], 
                                dp[i][1] + a[i]); 
    } 
  
    // Return the maximum sum 
    return dp[n][0]; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = { -10, 5, -4 }; 
    int n = a.length; 
  
    System.out.println(max_sum(a, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

