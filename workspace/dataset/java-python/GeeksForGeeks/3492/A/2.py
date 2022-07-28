

# Python3 implementation of the  
# above approach 
  
n = 4
m = 4
  
# Function to calculate probability 
def calcProbability(M, k): 
  
    # declare dp[][] and sum[] 
    dp = [[0 for i in range(n)]  
             for i in range(m)] 
    Sum = [0 for i in range(n)] 
  
    # precalculate the first row 
    for j in range(n):  
        dp[0][j] = M[0][j] 
        Sum[0] += dp[0][j] 
      
    # calculate the probability for 
    # each element and update dp table 
    for i in range(1, m):  
        for j in range(n): 
            dp[i][j] += (dp[i - 1][j] / 
                         Sum[i - 1] + M[i][j]) 
            Sum[i] += dp[i][j] 
          
    # return result 
    return dp[n - 1][k - 1] / Sum[n - 1] 
  
# Driver code 
  
M = [[ 1, 1, 0, 3 ], 
     [ 2, 3, 2, 3 ], 
     [ 9, 3, 0, 2 ], 
     [ 2, 3, 2, 2 ]]  
k = 3
  
print(calcProbability(M, k)) 
  
# This code is contributed 
# by mohit kumar 29 

