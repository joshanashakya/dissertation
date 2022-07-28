

// Java implementation of the approach  
import java.util.*;  
  
class GFG  
{  
  
// Function to return the pairs of subsequences  
// from S[] and subsequences from T[] such  
// that both have the same content  
static int subsequence(int[] S, int[] T,  
                       int n, int m)  
{  
  
    // Create dp array  
    int [][] dp = new int[n + 1][m + 1]; 
    int mod = 1000000007; 
  
    // Base values  
    for (int i = 0; i <= n; i++)  
        dp[i][0] = 1;  
  
    // Base values  
    for (int j = 0; j <= m; j++)  
        dp[0][j] = 1;  
  
    for (int i = 1; i <= n; ++i)  
    {  
        for (int j = 1; j <= m; ++j) 
        {  
  
            // Keep previous dp value  
            dp[i][j] = dp[i - 1][j] +  
                       dp[i][j - 1] -  
                       dp[i - 1][j - 1];  
  
            // If both elements are same  
            if (S[i - 1] == T[j - 1])  
                dp[i][j] += dp[i - 1][j - 1];  
  
            dp[i][j] += mod;  
            dp[i][j] %= mod;  
        }  
    }  
  
    // Return the required answer  
    return dp[n][m];  
}  
  
  
// Driver code  
public static void main(String []args)  
{  
    int S[] = { 1, 1 };  
    int n = S.length; 
  
    int T[] = { 1, 1 };  
    int m = T.length;  
  
    System.out.println(subsequence(S, T, n, m));  
}  
}  
  
// This code is contributed by Sanjit Prasad 

