

# Python3 implementation of the approach  
  
import numpy as np  
n = 3
  
# 2d array to store  
# states of dp  
dp = np.zeros((n,n)) 
  
# Array to determine whether  
# a state has been solved before  
v = np.zeros((n,n));  
  
# Function to return the minimum steps required  
def minSteps(i, j, arr) :  
  
    # Base cases  
    if (i == n - 1 and j == n - 1) : 
        return 0;  
  
    if (i > n - 1 or j > n - 1) : 
        return 9999999;  
  
    # If a state has been solved before  
    # it won't be evaluated again  
    if (v[i][j]) : 
        return dp[i][j];  
  
    v[i][j] = 1;  
    dp[i][j] = 9999999;  
  
    # Recurrence relation  
    for k in range(max(0, arr[i][j] + j - n + 1),min(n - i - 1, arr[i][j]) + 1) : 
        dp[i][j] = min(dp[i][j], minSteps(i + k, j + arr[i][j] - k, arr));  
      
  
    dp[i][j] += 1;  
  
    return dp[i][j];  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [  
            [ 4, 1, 2 ],  
            [ 1, 1, 1 ],  
            [ 2, 1, 1 ]  
            ];  
  
    ans = minSteps(0, 0, arr);  
    if (ans >= 9999999) : 
        print(-1);  
    else : 
        print(ans);  
  
# This code is contributed by AnkitRai01 

