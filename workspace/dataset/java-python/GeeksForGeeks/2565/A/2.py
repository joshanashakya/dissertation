

# Python3 implementation of the approach 
  
# Function to return the count of 
# n-digit numbers that satisfy 
# the given conditions 
def count_numbers(k, n): 
  
    # DP array to store the 
    # pre-caluclated states 
    dp = [[0 for i in range(2)]  
             for i in range(n + 1)] 
  
    # Base cases 
    dp[1][0] = 0
    dp[1][1] = k - 1
    for i in range(2, n + 1): 
  
        # i-digit numbers ending with 0 
        # can be formed by concatenating 
        # 0 in the end of all the (i - 1)-digit 
        # number ending at a non-zero digit 
        dp[i][0] = dp[i - 1][1] 
  
        # i-digit numbers ending with non-zero 
        # can be formed by concatenating any non-zero 
        # digit in the end of all the (i - 1)-digit 
        # number ending with any digit 
        dp[i][1] = (dp[i - 1][0] + 
                    dp[i - 1][1]) * (k - 1) 
  
    # n-digit number ending with 
    # and ending with non-zero 
    return dp[n][0] + dp[n][1] 
  
# Driver code 
k = 10
n = 3
print(count_numbers(k, n)) 
  
# This code is contributed by Mohit Kumar 

