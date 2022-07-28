

# Python3 implementation for the above mentioned  
# Dynamic Programming approach  
import numpy as np 
import sys 
  
INT_MIN = -(sys.maxsize - 1) 
  
# Function to find the maximum subset sum  
def maxSum(a, n) :  
  
    # sum of all elements  
    sum = 0;  
    for i in range(n) : 
        sum += a[i];  
  
    limit = 2 * sum + 1;  
  
    # bottom up lookup table;  
    dp = np.zeros((n + 1,limit));  
  
    # initialising dp table with INT_MIN  
    # where, INT_MIN means no solution  
    for i in range(n + 1) : 
        for j in range(limit) : 
            dp[i][j] = INT_MIN;  
  
    # Case when diff is 0  
    dp[0][sum] = 0;  
    for i in range(1, n + 1) : 
        for j in range(limit) : 
  
            # Putting ith element in g0  
            if ((j - a[i - 1]) >= 0 and dp[i - 1][j - a[i - 1]] != INT_MIN) : 
  
                dp[i][j] = max(dp[i][j], dp[i - 1][j - a[i - 1]]  
                                            + a[i - 1]);  
  
            # Putting ith element in g1  
            if ((j + a[i - 1]) < limit and dp[i - 1][j + a[i - 1]] != INT_MIN) : 
  
                dp[i][j] = max(dp[i][j], dp[i - 1][j + a[i - 1]]);  
  
            # Ignoring ith element  
            if (dp[i - 1][j] != INT_MIN) : 
  
                dp[i][j] = max(dp[i][j], dp[i - 1][j]);  
                  
    return dp[n][sum];  
  
# Driver code  
  
if __name__ == "__main__" :  
  
    n = 4;  
    a = [ 1, 2, 3, 6 ];  
    print(maxSum(a, n));  
  
# This code is contributed by Yash_R 

