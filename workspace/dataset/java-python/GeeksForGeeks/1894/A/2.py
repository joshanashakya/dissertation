

# Python3 implementation of the approach  
import numpy as np 
  
mod = int(1e9 + 7)  
  
# Function to return the pairs of subsequences  
# from S[] and subsequences from T[] such  
# that both have the same content  
def subsequence(S, T, n, m) :  
  
    # Create dp array  
    dp = np.zeros((n + 1, m + 1));  
  
    # Base values  
    for i in range(n + 1) : 
        dp[i][0] = 1;  
  
    # Base values  
    for j in range(m + 1) :  
        dp[0][j] = 1;  
  
    for i in range(1, n + 1) : 
        for j in range(1, m + 1) : 
  
            # Keep previous dp value  
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - \ 
                       dp[i - 1][j - 1];  
  
            # If both elements are same  
            if (S[i - 1] == T[j - 1]) : 
                dp[i][j] += dp[i - 1][j - 1];  
  
            dp[i][j] += mod;  
            dp[i][j] %= mod;  
  
    # Return the required answer  
    return dp[n][m];  
  
# Driver code  
if __name__ == "__main__" :  
  
    S = [ 1, 1 ];  
    n = len(S);  
  
    T = [ 1, 1 ];  
    m = len(T);  
  
    print(subsequence(S, T, n, m));  
  
# This code is contributed by kanugargng 

