

# Python3 program to count number  
# of decreasing path in a matrix  
MAX = 100
  
# Function that returns the number of  
# decreasing paths from a cell(i, j)  
def CountDecreasingPathsCell(mat, dp, n, x, y): 
      
    # checkinf if already calculated  
    if (dp[x][y] != -1): 
        return dp[x][y]  
          
    # all possible paths  
    delta = [[0, 1], [1, 0],  
             [-1, 0], [0, -1]]  
    newx, newy = 0, 0
      
    # counts the total number of paths  
    ans = 1
      
    # In all four allowed direction.  
    for i in range(4): 
          
        # new co-ordinates  
        newx = x + delta[i][0] 
        newy = y + delta[i][1] 
          
        # Checking if not going out of matrix and next  
        # cell value is less than current cell value.  
        if (newx >= 0 and newx < n and newy >= 0 and 
            newy < n and mat[newx][newy] < mat[x][y]): 
            ans += CountDecreasingPathsCell(mat, dp, n,  
                                            newx, newy)  
                                              
    # fucntion that returns the answer  
    dp[x][y] = ans 
    return dp[x][y] 
  
# Function that counts the total  
# decreasing path in the matrix  
def countDecreasingPathsMatrix(n,mat): 
    dp = [] 
      
    # Initalising dp[][] to -1.  
    for i in range(n): 
        l = [] 
        for j in range(n): 
            l.append(-1) 
        dp.append(l) 
    sum = 0
      
    # Calculating number of decreasing 
    # path from each cell.  
    for i in range(n): 
        for j in range(n): 
            sum += CountDecreasingPathsCell(mat, dp,  
                                            n, i, j)  
    return sum
      
# Driver Code  
n = 2
mat = [[1, 2], [1, 3]] 
  
# function call that returns the  
# count of decreasing paths in a matrix  
print(countDecreasingPathsMatrix(n, mat)) 
  
# This code is contributed by SHUBHAMSINGH10 

