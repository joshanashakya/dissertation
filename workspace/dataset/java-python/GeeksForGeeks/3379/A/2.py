

# Python3 iimplementation of the 
# above approach  
mod = 1000000007;  
  
# Function to return no of ways to  
# build a binary string of length N 
# such that 0s always occur in  
# groups of size K  
def noOfBinaryStrings(N, k) : 
    dp = [0] * 100002;  
    for i in range(1, K) :  
        dp[i] = 1;  
      
    dp[k] = 2;  
  
    for i in range(k + 1, N + 1) : 
        dp[i] = (dp[i - 1] + dp[i - k]) % mod;  
  
    return dp[N];  
  
# Driver Code  
if __name__ == "__main__" :  
  
    N = 4;  
    K = 2;  
      
    print(noOfBinaryStrings(N, K));  
  
# This code is contributed by Ryuga 

