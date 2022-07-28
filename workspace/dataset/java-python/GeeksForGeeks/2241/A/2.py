

# Python3 implementation of the approach 
  
# Function to return the number of 
# ways of partioning 
def ways(s, n): 
  
    dp = [[0 for i in range(n)] 
             for i in range(n)] 
  
    # Base Case 
    for i in range(n): 
        dp[0][i] = 1
  
    for i in range(1, n): 
  
        # To store sub-S[i][j] 
        temp = "" 
        for j in range(i, n): 
            temp += s[j] 
  
            # To store sub-S[k][i-1] 
            test = "" 
            for k in range(i - 1, -1, -1): 
                test += s[k] 
                if (test < temp): 
                    dp[i][j] += dp[k][i - 1] 
  
    ans = 0
    for i in range(n): 
          
        # Add all the ways where S[i][n-1] 
        # will be the last partition 
        ans += dp[i][n - 1] 
  
    return ans 
  
# Driver code 
s = "aabc"
n = len(s) 
  
print(ways(s, n)) 
  
# This code is contributed by Mohit Kumarv 

