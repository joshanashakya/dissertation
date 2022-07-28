

# Python 3implementation of the approach 
from math import log2 
  
# Returns count of ordered subsets of arr[] 
# with XOR value = K 
def subsetXOR(arr, n, K): 
      
    # Find maximum element in arr[] 
    max_ele = arr[0] 
    for i in range(1, n): 
        if (arr[i] > max_ele): 
            max_ele = arr[i] 
  
    # Maximum possible XOR value 
    m = (1 << int(log2(max_ele) + 1)) - 1
  
    # The value of dp[i][j][k] is the number  
    # of subsets of length k having XOR of their  
    # elements as j from the set arr[0...i-1] 
    dp = [[[0 for i in range(n + 1)]  
              for j in range(m + 1)]  
              for k in range(n + 1)] 
  
    # Initializing all the values  
    # of dp[i][j][k] as 0 
    for i in range(n + 1): 
        for j in range(m + 1): 
            for k in range(n + 1): 
                dp[i][j][k] = 0
  
    # The xor of empty subset is 0 
    for i in range(n + 1): 
        dp[i][0][0] = 1
  
    # Fill the dp table 
    for i in range(1, n + 1): 
        for j in range(m + 1): 
            for k in range(n + 1): 
                dp[i][j][k] = dp[i - 1][j][k] 
                if (k != 0): 
                    dp[i][j][k] += k * dp[i - 1][j ^ arr[i - 1]][k - 1] 
  
    # The answer is the number of subsets of all lengths 
    # from set arr[0..n-1] having XOR of elements as k 
    ans = 0
    for i in range(1, n + 1): 
        ans += dp[n][K][i] 
      
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [1, 2, 3] 
    k = 1
    n = len(arr) 
    print(subsetXOR(arr, n, k)) 
      
# This code is contributed by 
# Surendra_Gangwar 

