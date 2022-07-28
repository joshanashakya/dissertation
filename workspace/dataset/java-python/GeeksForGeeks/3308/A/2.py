

# Python3 implementation of the approach 
N = 1000
dp = [-1] * N 
  
# Function to reutrn the minimum 
# number of given operations 
# required to convert n to m 
def minOperations(k): 
  
    # If k is either 0 or out of range 
    # then return max 
    if (k <= 0 or k >= 1000):  
        return 1e9
      
    # If k = m then conversion is 
    # complete so return 0 
    if (k == m):  
        return 0
      
    dp[k] = dp[k] 
      
    # If it has been calculated earlier 
    if (dp[k] != -1):  
        return dp[k] 
      
    dp[k] = 1e9
      
    # Call for 2*k and k-1 and return 
    # the minimum of them. If k is even 
    # then it can be reached by 2*k opertaions 
    # and If k is odd then it can be reached 
    # by k-1 opertaions so try both cases 
    # and return the minimum of them 
    dp[k] = 1 + min(minOperations(2 * k), 
                    minOperations(k - 1)) 
    return dp[k] 
  
# Driver code 
if __name__ == '__main__': 
    n = 4
    m = 6
    print(minOperations(n))  
      
# This code is contributed by ashutosh450 

