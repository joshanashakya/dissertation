

# Python3 implementation of the approach  
  
# Recursive function to return the total  
# paths from grid[i][j] to grid[n - 1][n - 1]  
def totalPaths(i, j, n, grid, dp):  
  
    # Out of bounds  
    if (i < 0 or j < 0 or i >= n or j >= n):  
        return 0
  
    # If the current state  
    # hasn't been solved before  
    if (dp[i][j] == -1):  
      
        # Only valid move is right  
        if (grid[i][j] == 1):  
            dp[i][j] = totalPaths(i, j + 1, n, grid, dp)  
  
        # Only valid move is down  
        elif (grid[i][j] == 2):  
            dp[i][j] = totalPaths(i + 1, j, n, grid, dp)  
  
        # Right and down, both are valid moves  
        else: 
            dp[i][j] = totalPaths(i, j + 1, n, grid, dp) +\ 
                       totalPaths(i + 1, j, n, grid, dp)  
      
    return dp[i][j]  
  
# Recursive function to return the maximum  
# sum along the path from grid[i,j] to grid[n - 1,n - 1]  
def maxSumPath(i, j, n, grid, dp):  
  
    # Out of bounds  
    if (i < 0 or j < 0 or i >= n or j >= n):  
        return 0
  
    # If the current state  
    # hasn't been solved before  
    if (dp[i][j] == -1):  
      
        # Only valid move is right  
        if (grid[i][j] == 1):  
            dp[i][j] = grid[i][j] + \ 
                       maxSumPath(i, j + 1, n, grid, dp)  
  
        # Only valid move is down  
        elif (grid[i][j] == 2):  
            dp[i][j] = grid[i][j] + \ 
                       maxSumPath(i + 1, j, n, grid, dp)  
  
        # Right and down, both are valid moves  
        else: 
            dp[i][j] = grid[i][j] + \ 
                       max(maxSumPath(i, j + 1, n, grid, dp),  
                           maxSumPath(i + 1, j, n, grid, dp))  
      
    return dp[i][j]  
  
# Driver code  
if __name__ == '__main__': 
      
    grid = [[ 1, 1, 3, 2, 1 ],  
            [ 3, 2, 2, 1, 2 ],  
            [ 1, 3, 3, 1, 3 ],  
            [ 1, 2, 3, 1, 2 ],  
            [ 1, 1, 1, 3, 1 ]] 
  
    n = len(grid[0]) 
  
    # Fill the dp[n][n] array with -1 
    dp= [[-1] * n] * n  
  
    # When source and destination are same  
    # then there is only 1 path  
    dp[n - 1][n - 1] = 1
  
    # Print the count of paths from  
    # grid[0,0] to grid[n - 1][n - 1]  
    print("Total paths:",  
           totalPaths(0, 0, n, grid, dp))  
  
    # Fill the dp[n][n] array again with -1  
    dp= [[-1] * n] * n  
  
    # When source and destination are same  
    # then the sum is grid[n - 1][n - 1]  
    dp[n - 1][n - 1] = grid[n - 1][n - 1]  
  
    # Print the maximum sum among all the paths  
    # from grid[0,0] to grid[n - 1][n - 1]  
    print("Maximum sum:",  
           maxSumPath(0, 0, n, grid, dp))  
  
# This code is contributed by ashutosh450  

