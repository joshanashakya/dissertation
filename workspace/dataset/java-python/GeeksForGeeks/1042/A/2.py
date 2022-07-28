

# Python3 implementation of the  
# above approach 
import math as mt 
  
N = 100005
MAX = 1000002
  
lpd = [0 for i in range(MAX)] 
  
# to compute least prime divisor of i 
def preCompute(): 
  
    lpd[0], lpd[1] = 1, 1
  
    for i in range(2, mt.ceil(mt.sqrt(MAX))): 
        for j in range(2 * i, MAX, i): 
            if (lpd[j] == 0): 
                lpd[j] = i 
              
    for i in range(2, MAX): 
        if (lpd[i] == 0): 
            lpd[i] = i 
          
# Function that returns the maximum 
# length subsequence such that 
# adjacent elements have a common factor. 
def maxLengthSubsequence(arr, n): 
    dp = [1 for i in range(N + 1)] 
  
    pos = dict() 
  
    # Initialize dp array with 1. 
    for i in range(1, n): 
        while (arr[i] > 1): 
            p = lpd[arr[i]] 
            if (p in pos.keys()): 
                  
                # p has appeared at least once. 
                dp[i] = max(dp[i], 1 + dp[pos[p]]) 
  
            # Update latest occurrence of prime p. 
            pos[p] = i 
            while (arr[i] % p == 0): 
                arr[i] //= p 
          
    # Take maximum value as the answer. 
    ans = 1
    for i in range(1, n + 1): 
        ans = max(ans, dp[i]) 
      
    return ans 
  
# Driver code 
arr = [13, 2, 8, 6, 3, 1, 9] 
n = len(arr) 
  
preCompute() 
  
print(maxLengthSubsequence(arr, n)) 
  
# This code is contributed by Mohit Kumar 

