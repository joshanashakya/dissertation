

# Python 3 implementation of the approach 
  
# Function to return the count 
# of required strings 
def solve(i, x, dp): 
    if (i < 0): 
        return x == 3
    if (dp[i][x] != -1): 
        return dp[i][x] 
  
    # '0' at ith position 
    dp[i][x] = solve(i - 1, 0, dp) 
  
    # '1' at ith position 
    dp[i][x] += solve(i - 1, x + 1, dp) 
    return dp[i][x] 
  
  
# Driver code 
if __name__ == "__main__": 
  
    n = 4; 
    dp = [[0 for i in range(n)] for j in range(4)] 
  
    for i in range(n): 
        for j in range(4): 
            dp[i][j] = -1
  
    for i in range(n) : 
  
        # Base condition: 
        # 2^(i+1) because of 0 indexing 
        dp[i][3] = (1 << (i + 1)) 
      
    print(solve(n - 1, 0, dp)) 
  
# This code is contributed by ChitraNayal 

