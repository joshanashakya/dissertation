

# Python 3 program to count the number of  
# paths with weight W in a K-ary tree  
import numpy as np 
  
# Function to return the number of ways  
# having weight as wt in K-ary tree  
def solve(dp, wt, K, M, used) : 
              
    # Return 0 if weight becomes less  
    # than zero  
    if (wt < 0) : 
        return 0
  
    if (wt == 0) : 
  
        # Return one only if the  
        # current path has included  
        # edge weight of atleast M  
        if (used) : 
            return 1
        return 0
      
    if (dp[wt][used] != -1) : 
        return dp[wt][used]  
  
    ans = 0
    for i in range(1, K + 1) :  
  
        # If the current edge weight  
        # is greater than or equal to  
        # M, set used as true  
        if (i >= M) : 
            ans += solve(dp, wt - i,  
                         K, M, used | 1)  
        else : 
            ans += solve(dp, wt - i,  
                         K, M, used)  
      
    dp[wt][used] = ans  
      
    return ans 
  
# Driver Code 
if __name__ == "__main__" :  
  
    W = 3
    K = 3
    M = 2
    dp = np.ones((W + 1, 2));  
    dp = -1 * dp  
    print(solve(dp, W, K, M, 0))  
  
# This code is contributed by Ryuga 

