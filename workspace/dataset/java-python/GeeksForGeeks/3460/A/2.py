

# Python 3 implementation of the above approach 
global maxn 
maxn = 16
  
# Function to generate the dp array 
def precompute(): 
    dp = [-1 for i in range(maxn)] 
    dp[0] = 0
  
    v = [4, 6, 9] 
  
    for i in range(1, maxn, 1): 
          
        # combination of three integers 
        for k in range(3): 
            j = v[k] 
              
            # take the maxium number of summands 
            if (i >= j and dp[i - j] != -1): 
                dp[i] = max(dp[i], dp[i - j] + 1) 
  
    return dp 
  
# Function to find the maximum number of summands 
def Maximum_Summands(dp, n): 
      
    # If n is a smaller number,  
    # less than 16, return dp[n] 
    if (n < maxn): 
        return dp[n] 
  
    else: 
          
        # Else, find a minimal number t 
        # as explained in solution 
        t = int((n - maxn) / 4)+ 1
        return t + dp[n - 4 * t] 
  
# Driver code 
if __name__ == '__main__': 
    n = 12
  
    # Generate dp array 
    dp = precompute() 
  
    print(Maximum_Summands(dp, n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

