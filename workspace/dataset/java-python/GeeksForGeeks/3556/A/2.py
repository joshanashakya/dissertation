

# Python3 program to implement above approach  
import numpy as np; 
  
n = 3
  
# 2d array to store  
# states of dp  
dp = np.zeros((n, n));  
  
# array to determine whether  
# a state has been solved before  
v = np.zeros((n, n));  
  
# Function to find the minimum number of  
# steps to reach the end of matrix  
def minSteps(i, j, arr) :  
  
    # base cases  
    if (i == n - 1 and j == n - 1) : 
        return 0;  
  
    if (i > n - 1 or j > n - 1) : 
        return 9999999;  
  
    # if a state has been solved before  
    # it won't be evaluated again.  
    if (v[i][j]) : 
        return dp[i][j];  
  
    v[i][j] = 1;  
  
    # recurrence relation  
    dp[i][j] = 1 + min(minSteps(i + arr[i][j], j, arr),  
                    minSteps(i, j + arr[i][j], arr));  
  
    return dp[i][j];  
  
  
# Driver Code  
arr = [ [ 2, 1, 2 ],  
            [ 1, 1, 1 ],  
            [ 1, 1, 1 ] 
            ]; 
              
ans = minSteps(0, 0, arr);  
if (ans >= 9999999) : 
    print(-1);  
          
else : 
    print(ans);  
  
# This code is contributed by AnkitRai01 

