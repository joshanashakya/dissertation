

// Java program to find minimum deletions to make  
// palindrome. 
import java.io.*; 
import java.util.*; 
  
class GFG  
{ 
  
    static int getLevenstein(StringBuilder input) 
    { 
        StringBuilder revInput = new StringBuilder(input); 
  
        // Find reverse of input string 
        revInput = revInput.reverse(); 
  
        // Create a DP table for storing edit distance 
        // of string and reverse. 
        int n = input.length(); 
        int[][] dp = new int[n + 1][n + 1]; 
        for (int i = 0; i <= n; ++i)  
        { 
            dp[0][i] = i; 
            dp[i][0] = i; 
        } 
  
        // Find edit distance between input and revInput 
        // considering only delete operation. 
        for (int i = 1; i <= n; ++i)  
        { 
            for (int j = 1; j <= n; ++j)  
            { 
                if (input.charAt(i - 1) == revInput.charAt(j - 1)) 
                    dp[i][j] = dp[i - 1][j - 1]; 
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]); 
            } 
        } 
  
        /* Go from bottom left to top right and find the minimum */
        int res = Integer.MAX_VALUE; 
        for (int i = n, j = 0; i >= 0; i--, j++)  
        { 
            res = Math.min(res, dp[i][j]); 
            if (i < n) 
                res = Math.min(res, dp[i + 1][j]); 
            if (i > 0) 
                res = Math.min(res, dp[i - 1][j]); 
        } 
        return res; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        StringBuilder input = new StringBuilder("myfirstgeekarticle"); 
        System.out.println(getLevenstein(input)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

