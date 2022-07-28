

# A Dynamic Programming based Python program to find 
# minimum jumps to reach last building from first. 
  
R = 4
C = 3
  
def isSafe( x, y): 
  
    return (x < R and y < C) 
  
# Lookup table used for memoization. 
dp = [[-1 for i in range(C)] for i in range(R)] 
  
# Returns minimum jump path from (0, 0) to (m, n) 
# in hight[R][C]*/ 
def minJump(height, x, y): 
  
  
# if we visited it before 
    if (dp[x][y] != -1): 
        return dp[x][y] 
  
    if (x == R - 1 and y == C - 1): 
        return (dp[x][y] == 0) 
  
# Find minimum jumps if we go through diagonal 
    diag = 10**9
    if (isSafe(x + 1, y + 1)): 
        diag = minJump(height, x + 1, y + 1) + abs(height[x][y] - height[x + 1][y + 1]) 
  
# Find minimum jumps if we go through down 
    down =10**9
    if (isSafe(x + 1, y)): 
        down = minJump(height, x + 1, y) + abs(height[x][y] - height[x + 1][y]) 
  
# Find minimum jumps if we go through right 
    right =10**9
    if (isSafe(x, y + 1)): 
        right = minJump(height, x, y + 1) + abs(height[x][y] - height[x][y + 1]) 
  
# return minimum jump 
    dp[x][y] = min(down, right, diag) 
    return dp[x][y] 
  
# Driver code  
  
height=[[ 5, 4, 2 ], 
    [ 9, 2, 1 ], 
    [ 2, 5, 9 ], 
    [ 1, 3, 11 ]] 
  
print(minJump(height, 0, 0)) 
  
# This code is contributed by mohit kumar 29 

