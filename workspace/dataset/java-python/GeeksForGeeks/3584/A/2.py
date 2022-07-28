

# Python 3 implementation of the approach 
import sys 
  
# Function to return the minimum cost 
# to reach the last index 
def FindMinimumCost(ind, a, n, k, dp): 
      
    # If we reach the last index 
    if (ind == (n - 1)): 
        return 0
  
    # Already visited state 
    elif (dp[ind] != -1): 
        return dp[ind] 
    else: 
          
        # Initially maximum 
        ans = sys.maxsize 
  
        # Visit all possible reachable index 
        for i in range(1, k + 1): 
              
            # If inside range 
            if (ind + i < n): 
                ans = min(ans, abs(a[ind + i] - a[ind]) + 
                      FindMinimumCost(ind + i, a, n, k, dp)) 
  
            # We cannot move any further 
            else: 
                break
  
        # Memoize 
        dp[ind] = ans 
        return ans 
  
# Driver Code 
if __name__ == '__main__': 
    a = [10, 30, 40, 50, 20] 
    k = 3
    n = len(a) 
    dp = [-1 for i in range(n)] 
    print(FindMinimumCost(0, a, n, k, dp)) 
  
# This code is contributed by 
# Surendra_Gangwar 

