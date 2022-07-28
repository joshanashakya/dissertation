

# Python 3 program to find total no.of ways 
# to reach nth step 
  
# Function which returns total no.of ways 
# to reach nth step from sth steps 
def TotalWays(n, s, k): 
  
    # Initialize dp array 
    dp = [0]*n 
  
    # Initialize (s-1)th index to 1 
    dp[s - 1] = 1
  
    # Iterate a loop from s to n 
    for i in range(s, n): 
  
        # starting range for counting ranges 
        idx = max(s - 1, i - k) 
  
        # Calculate Maximum moves to 
        # Reach ith step 
        for j in range( idx, i) : 
            dp[i] += dp[j] 
  
    # For nth step return dp[n-1] 
    return dp[n - 1] 
  
# Driver Code 
if __name__ == "__main__": 
    # no of steps 
    n = 5
  
    # Atmost steps allowed 
    k = 2
  
    # starting range 
    s = 2
    print("Total Ways = ", TotalWays(n, s, k)) 
      
# This code is contributed by chitranayal 

