

# Python3 implementation of the approach  
MOD = 1000000007
  
# Function to return the count  
# of all possible valid strings  
def countStrings(N):  
  
    # Initialise and fill 0's in the dp array 
    dp = [[0] * 3 for i in range(N + 1)] 
  
    # Base cases  
    dp[1][0] = 1;  
    dp[1][1] = 1;  
    dp[1][2] = 0;  
  
    for i in range(2, N + 1):  
  
        # dp[i][j] = number of possible strings  
        # such that '1' just appeared consecutively  
        # j times upto the ith index  
        dp[i][0] = (dp[i - 1][0] + 
                    dp[i - 1][1] + 
                    dp[i - 1][2]) % MOD  
  
        # Taking previously calculated value  
        dp[i][1] = dp[i - 1][0] % MOD  
        dp[i][2] = dp[i - 1][1] % MOD  
      
  
    # Taking all possible cases that  
    # can appear at the Nth position  
    ans = (dp[N][0] + dp[N][1] + dp[N][2]) % MOD  
  
    return ans  
  
# Driver code 
if __name__ == '__main__':  
  
    N = 3
  
    print(countStrings(N))  
  
# This code is contributed by ashutosh450 

