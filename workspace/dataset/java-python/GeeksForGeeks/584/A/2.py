

# Python3 implementation of the approach 
n = 3
maxV = 20
  
# 3d array to store states of dp 
dp = [[[0 for i in range(maxV)]  
          for i in range(n)]  
          for i in range(n)] 
  
# Array to determine whether 
# a state has been solved before 
v = [[[0 for i in range(maxV)]  
         for i in range(n)]  
         for i in range(n)] 
  
# Function to return 
# the count of required paths 
def countWays(i, j, x, arr): 
  
    # Base cases 
    if (i == n or j == n): 
        return 0
  
    x = (x & arr[i][j]) 
    if (x == 0): 
        return 0
  
    if (i == n - 1 and j == n - 1): 
        return 1
  
    # If a state has been solved before 
    # it won't be evaluated again 
    if (v[i][j][x]): 
        return dp[i][j][x] 
  
    v[i][j][x] = 1
  
    # Recurrence relation 
    dp[i][j][x] = countWays(i + 1, j, x, arr) + \ 
                  countWays(i, j + 1, x, arr); 
  
    return dp[i][j][x] 
  
# Driver code 
arr = [[1, 2, 1 ], 
       [1, 1, 0 ], 
       [2, 1, 1 ]] 
  
print(countWays(0, 0, arr[0][0], arr)) 
  
# This code is contributed by Mohit Kumar 

