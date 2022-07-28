

# Python3 implementation of the approach 
n = 3
MAX = 60
  
# To store the states of dp 
dp = [[[0 for i in range(30)]    
          for i in range(30)] 
          for i in range(MAX + 1)] 
  
# To check whether a particular state 
# of dp has been solved 
v = [[[0 for i in range(30)]  
         for i in range(30)] 
         for i in range(MAX + 1)] 
  
# Function to find the ways 
# using memoisation 
def findCount(mat, i, j, m): 
      
    # Base cases 
    if (i == 0 and j == 0): 
        if (m == mat[0][0]): 
            return 1
        else: 
            return 0
  
    # If required score becomes negative 
    if (m < 0): 
        return 0
  
    if (i < 0 or j < 0): 
        return 0
  
    # If current state has been reached before 
    if (v[i][j][m] > 0): 
        return dp[i][j][m] 
  
    # Set current state to visited 
    v[i][j][m] = True
  
    dp[i][j][m] = (findCount(mat, i - 1, j,  
                             m - mat[i][j]) + 
                   findCount(mat, i, j - 1,  
                             m - mat[i][j])) 
  
    return dp[i][j][m] 
  
# Driver code 
mat = [ [ 1, 1, 1 ], 
        [ 1, 1, 1 ], 
        [ 1, 1, 1 ] ] 
m = 5
print(findCount(mat, n - 1, n - 1, m)) 
  
# This code is contributed by mohit kumar 

