

# Python3 implementation of above approach 
mod = 10**9 + 7
  
# find the number of ways to reach the end  
def ways(arr, n): 
      
    # dp to store value  
    dp = [0] * (n + 1) 
      
    # base case  
    dp[n - 1] = 1
      
    # Bottom up dp structure  
    for i in range(n - 2, -1, -1): 
        dp[i] = 0
          
        # F[i] is dependent of  
        # F[i + 1] to F[i + k]  
        j = 1
        while((j + i) < n and j <= arr[i]): 
            dp[i] += dp[i + j]  
            dp[i] %= mod  
            j += 1
      
    # Return value of dp[0]  
    return dp[0] % mod  
  
# Driver code  
arr = [5, 3, 1, 4, 3 ] 
n = len(arr)  
print(ways(arr, n) % mod) 
  
# This code is contributed by SHUBHAMSINGH10 

