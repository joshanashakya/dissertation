

// Java program to count number of binary strings 
// with k times appearing consecutive 1's. 
class GFG { 
  
    static int countStrings(int n, int k) 
    { 
        // dp[i][j][0] stores count of binary 
        // strings of length i with j consecutive 
        // 1's and ending at 0. 
        // dp[i][j][1] stores count of binary 
        // strings of length i with j consecutive 
        // 1's and ending at 1. 
        int dp[][][] = new int[n + 1][k + 1][2]; 
  
        // If n = 1 and k = 0. 
        dp[1][0][0] = 1; 
        dp[1][0][1] = 1; 
  
        for (int i = 2; i <= n; i++) { 
  
            // number of adjacent 1's can not exceed i-1 
            for (int j = 0; j < i && j < k + 1; j++) { 
                dp[i][j][0] = dp[i - 1][j][0] + dp[i - 1][j][1]; 
                dp[i][j][1] = dp[i - 1][j][0]; 
  
                if (j - 1 >= 0) { 
                    dp[i][j][1] += dp[i - 1][j - 1][1]; 
                } 
            } 
        } 
  
        return dp[n][k][0] + dp[n][k][1]; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 5, k = 2; 
        System.out.println(countStrings(n, k)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

