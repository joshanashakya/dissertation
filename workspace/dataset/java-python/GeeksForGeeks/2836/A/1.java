

// Java program to find length of the 
// longest balanced subsequence. 
import java.io.*; 
  
class GFG { 
    static int maxLength(String s, int n) 
    { 
        int dp[][] = new int[n][n]; 
  
        // Considering all balanced substrings 
        // of length 2 
        for (int i = 0; i < n - 1; i++) 
            if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') 
                dp[i][i + 1] = 2; 
  
        // Considering all other substrings 
        for (int l = 2; l < n; l++) { 
            for (int i = 0, j = l; j < n; i++, j++) { 
                if (s.charAt(i) == '(' && s.charAt(j) == ')') 
                    dp[i][j] = 2 + dp[i + 1][j - 1]; 
  
                for (int k = i; k < j; k++) 
                    dp[i][j] = Math.max(dp[i][j], 
                                        dp[i][k] + dp[k + 1][j]); 
            } 
        } 
  
        return dp[0][n - 1]; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String s = "()(((((()"; 
        int n = s.length(); 
        System.out.println(maxLength(s, n)); 
    } 
} 
// This code is contributed by Prerna Saini 

