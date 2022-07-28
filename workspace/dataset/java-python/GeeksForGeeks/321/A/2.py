

# Python3 implementation of the above approach.  
import numpy as np 
  
N = 100
INF = 1000000
  
# states of DP  
dp = np.zeros((N, N));  
vis = np.zeros((N, N));  
  
# function to find minimum sum  
def findSum(arr, n, k, l, r) :  
  
    # base-case  
    if ((l) + (n - 1 - r) == k) :  
        return arr[r] - arr[l];  
          
    # if state is solved before, return  
    if (vis[l][r]) : 
        return dp[l][r];  
          
    # marking the state as solved  
    vis[l][r] = 1;  
      
    # recurrence relation  
    dp[l][r] = min(findSum(arr, n, k, l, r - 1),  
                    findSum(arr, n, k, l + 1, r)); 
      
    return dp[l][r] 
  
# driver function  
if __name__ == "__main__" :  
  
    # input values  
    arr = [ 1, 2, 100, 120, 140 ];  
    k = 2;  
    n = len(arr);  
  
    # calling the required function;  
    print(findSum(arr, n, k, 0, n - 1));  
      
# This code is contributed by AnkitRai01 

