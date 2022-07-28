

# Python3 implementation of the approach 
maxSize = 50
  
# To store the states of dp 
dp = [0] * maxSize 
  
# To determine whether a state 
# has been solved before 
v = [0] * maxSize 
  
# Function to return the count 
def expectedSteps(x): 
  
    # Base cases 
    if (x == 0): 
        return 0
    if (x <= 5): 
        return 6
  
    # If a state has been solved before 
    # it won't be evaluated again 
    if (v[x]): 
        return dp[x] 
  
    v[x] = 1
  
    # Recurrence relation 
    dp[x] = 1 + (expectedSteps(x - 1) + 
                 expectedSteps(x - 2) + 
                 expectedSteps(x - 3) + 
                 expectedSteps(x - 4) +
                 expectedSteps(x - 5) + 
                 expectedSteps(x - 6)) / 6
    return dp[x] 
  
# Driver code 
n = 10
  
print(round(expectedSteps(n - 1), 5)) 
  
# This code is contributed by Mohit Kumar 

