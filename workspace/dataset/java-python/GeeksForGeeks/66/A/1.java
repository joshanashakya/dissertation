

// Java implementation for the above mentioned  
// Dynamic Programming approach  
class GFG { 
      
    final static int INT_MIN = Integer.MIN_VALUE; 
      
    // Function to find the maximum subset sum  
    static int maxSum(int a[], int n)  
    {  
        // sum of all elements  
        int sum = 0;  
        for (int i = 0; i < n; i++)  
            sum += a[i];  
      
        int limit = 2 * sum + 1;  
      
        // bottom up lookup table;  
        int dp[][] = new int[n + 1][limit];  
      
        // initialising dp table with INT_MIN  
        // where, INT_MIN means no solution  
        for (int i = 0; i < n + 1; i++) {  
            for (int j = 0; j < limit; j++)  
                dp[i][j] = INT_MIN;  
        }  
      
        // Case when diff is 0  
        dp[0][sum] = 0;  
        for (int i = 1; i <= n; i++) {  
            for (int j = 0; j < limit; j++) {  
      
                // Putting ith element in g0  
                if ((j - a[i - 1]) >= 0 && dp[i - 1][j - a[i - 1]] != INT_MIN)  
      
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - a[i - 1]]  
                                                + a[i - 1]);  
      
                // Putting ith element in g1  
                if ((j + a[i - 1]) < limit && dp[i - 1][j + a[i - 1]] != INT_MIN)  
      
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j + a[i - 1]]);  
      
                // Ignoring ith element  
                if (dp[i - 1][j] != INT_MIN)  
      
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j]);  
            }  
        }  
      
        return dp[n][sum];  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 4;  
        int []a = { 1, 2, 3, 6 };  
        System.out.println(maxSum(a, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

