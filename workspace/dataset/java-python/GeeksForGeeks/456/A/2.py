

# A simple recursive solution to  
# count number of ways to reach  
# mat[m-1][n-1] from mat[0][0]  
# in a matrix mat[][] 
  
# Returns The number of way  
# from top-left to mat[m-1][n-1] 
def countPaths(m, n): 
  
    dp = [[0 for i in range(m + 1)]  
             for j in range(n + 1)] 
      
    for i in range(1, m + 1): 
        for j in range(1, n + 1): 
            if (i == 1 or j == 1): 
                dp[i][j] = 1
            else: 
                dp[i][j] = (dp[i - 1][j] + 
                            dp[i][j - 1])              
      
    return dp[m][n] 
  
# Driver code 
if __name__ =="__main__": 
      
    n = 5
    m = 5
    print(countPaths(n, m)) 
  
# This code is contributed  
# by ChitraNayal 

