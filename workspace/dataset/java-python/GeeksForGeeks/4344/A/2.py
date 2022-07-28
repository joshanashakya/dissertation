

# Python3 implementation of the approach  
import numpy as np 
import sys 
  
RODS = 3 
N = 3 
dp = np.zeros((N + 1,RODS + 1,RODS + 1));  
  
# Function to initialize the dp table  
def initialize() : 
  
    # Initialize with maximum value  
    for i in range(N + 1) : 
        for j in range(1, RODS + 1) : 
            for k in range(1, RODS + 1) : 
                dp[i][j][k] = sys.maxsize;  
              
  
# Function to return the minimum cost  
def mincost(idx, src, dest, costs) : 
  
    # Base case  
    if (idx > N) : 
        return 0;  
  
    # If problem is already solved,  
    # return the pre-calculated answer  
    if (dp[idx][src][dest] != sys.maxsize) : 
        return dp[idx][src][dest];  
  
    # Number of the auxilary disk  
    rem = 6 - (src + dest);  
  
    # Initialize the minimum cost as Infinity  
    ans = sys.maxsize;  
  
    # Calculationg the cost for first case  
    case1 = costs[src - 1][dest - 1] + mincost(idx + 1, src, rem, costs) + mincost(idx + 1, rem, dest, costs);  
  
    # Calculating the cost for second case  
    case2 = (costs[src - 1][rem - 1] + mincost(idx + 1, src, dest, costs) + mincost(idx + 1, dest, src, costs) + costs[rem - 1][dest - 1] + mincost(idx + 1, src, dest, costs));  
  
    # Minimum of both the above cases  
    ans = min(case1, case2);  
  
    # Store it in the dp table  
    dp[idx][src][dest] = ans;  
  
    # Return the minimum cost  
    return ans;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    costs = [ [ 0, 1, 2 ],  
            [ 2, 0, 1 ],  
            [ 3, 2, 0 ] ];  
    initialize();  
    print(mincost(1, 1, 3, costs));  
  
    # This code is contributed by AnkitRai01 

