

# Python 3 implementation of the approach 
  
max = 4
  
# Recursive function to find the  
# required number of ways 
def countWays(index, cnt, dp, n, m, k): 
  
    # When all positions are filled 
    if (index == n) : 
  
        # If adjacent pairs are exactly K 
        if (cnt == k): 
            return 1
        else: 
            return 0
  
    # If already calculated 
    if (dp[index][cnt] != -1): 
        return dp[index][cnt] 
  
    ans = 0
  
    # Next position filled with same color 
    ans += countWays(index + 1, cnt, dp, n, m, k) 
  
    # Next position filled with different color 
    # So there can be m-1 different colors 
    ans += (m - 1) * countWays(index + 1,  
                               cnt + 1, dp, n, m, k) 
  
    dp[index][cnt] = ans 
    return dp[index][cnt] 
  
# Driver Code 
if __name__ == "__main__": 
      
    n = 3
    m = 3
    k = 2
    dp = [[-1 for x in range(n + 1)]  
              for y in range(max)] 
  
    print(m * countWays(1, 0, dp, n, m, k)) 
  
# This code is contributed by ita_c 

