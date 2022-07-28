

// Java implementation of the above approach  
import java.util.*; 
  
class GFG  
{ 
  
    static int n; 
  
    // Function to return the count 
    // of required strings 
    static int solve(int i, int x, int dp[][])  
    { 
        if (i < 0)  
        { 
            return x == 3 ? 1 : 0; 
        } 
        if (dp[i][x] != -1)  
        { 
            return dp[i][x]; 
        } 
  
        // '0' at ith position 
        dp[i][x] = solve(i - 1, 0, dp); 
  
        // '1' at ith position 
        dp[i][x] += solve(i - 1, x + 1, dp); 
        return dp[i][x]; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        n = 4; 
        int dp[][] = new int[n][4]; 
  
        for (int i = 0; i < n; i++)  
        { 
            for (int j = 0; j < 4; j++)  
            { 
                dp[i][j] = -1; 
            } 
        } 
  
        for (int i = 0; i < n; i++)  
        { 
  
            // Base condition: 
            // 2^(i+1) because of 0 indexing 
            dp[i][3] = (1 << (i + 1)); 
        } 
        System.out.print(solve(n - 1, 0, dp)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

