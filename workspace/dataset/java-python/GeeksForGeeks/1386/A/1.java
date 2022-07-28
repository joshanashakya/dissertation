

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the number of ways to 
// form an array of size n such that sum of 
// all elements is divisible by 2 
static int countWays(int n, int l, int r) 
{ 
    int tL = l, tR = r; 
  
    // Represents first and last numbers 
    // of each type (modulo 0 and 1) 
    int[] L = new int[3]; 
    int[] R = new int[3]; 
    L[l % 2] = l; 
    R[r % 2] = r; 
  
    l++; 
    r--; 
  
    if (l <= tR && r >= tL) 
    { 
        L[l % 2] = l; 
        R[r % 2] = r; 
    } 
  
    // Count of numbers of each type between range 
    int cnt0 = 0, cnt1 = 0; 
    if (R[0] > 0 && L[0] > 0) 
        cnt0 = (R[0] - L[0]) / 2 + 1; 
    if (R[1] > 0 && L[1] > 0) 
        cnt1 = (R[1] - L[1]) / 2 + 1; 
  
    int[][] dp = new int[n + 1][3]; 
  
    // Base Cases 
    dp[1][0] = cnt0; 
    dp[1][1] = cnt1; 
    for (int i = 2; i <= n; i++)  
    { 
  
        // Ways to form array whose sum upto 
        // i numbers modulo 2 is 0 
        dp[i][0] = (cnt0 * dp[i - 1] [0] 
                    + cnt1 * dp[i - 1][1]); 
  
        // Ways to form array whose sum upto 
        // i numbers modulo 2 is 1 
        dp[i][1] = (cnt0 * dp[i - 1][1] 
                    + cnt1 * dp[i - 1][0]); 
    } 
  
    // Return the required count of ways 
    return dp[n][0]; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 2, l = 1, r = 3; 
    System.out.println(countWays(n, l, r)); 
} 
} 
  
// This code is contributed by Code_Mech. 

