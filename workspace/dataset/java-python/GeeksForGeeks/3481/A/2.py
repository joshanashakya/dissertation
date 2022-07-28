

# Python 3 implementation of the approach 
import sys 
  
# Input matrix 
n = 4
m = 4
arr = [[1, 0, 3, -1], 
    [3, 5, 1, -2], 
    [-2, 0, 1, 1], 
    [2, 1, -1, 1]] 
  
# DP matrix 
cache = [[[-1 for i in range(5)] for j in range(5)] for k in range(5)] 
  
# Function to return the sum of the cells 
# arr[i1][j1] and arr[i2][j2] 
def sum(i1, j1, i2, j2): 
    if (i1 == i2 and j1 == j2): 
        return arr[i1][j1] 
    return arr[i1][j1] + arr[i2][j2] 
  
# Recursive function to return the 
# required maximum cost path 
def maxSumPath(i1, j1, i2): 
      
    # Column number of second path 
    j2 = i1 + j1 - i2 
  
    # Base Case 
    if (i1 >= n or i2 >= n or j1 >= m or j2 >= m): 
        return 0
  
    # If already calculated, return from DP matrix 
    if (cache[i1][j1][i2] != -1): 
        return cache[i1][j1][i2] 
    ans = -sys.maxsize-1
  
    # Recurring for neighbouring cells of both paths together 
    ans = max(ans, maxSumPath(i1 + 1, j1, i2 + 1) + sum(i1, j1, i2, j2)) 
    ans = max(ans, maxSumPath(i1, j1 + 1, i2) + sum(i1, j1, i2, j2)) 
    ans = max(ans, maxSumPath(i1, j1 + 1, i2 + 1) + sum(i1, j1, i2, j2)) 
    ans = max(ans, maxSumPath(i1 + 1, j1, i2) + sum(i1, j1, i2, j2)) 
  
    # Saving result to the DP matrix for current state 
    cache[i1][j1][i2] = ans 
  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    print(maxSumPath(0, 0, 0)) 
  
# This code is contributed by 
# Surendra_Gangwar 

