

      
# Python implementation of the approach 
   
# Function to return the number 
# of chicks on the nth day 
def getChicks(n): 
   
    # Size of dp[] has to be 
    # at least 6 (1-based indexing) 
    size = max(n, 7); 
    dp = [0]*size; 
   
    dp[0] = 0; 
    dp[1] = 1; 
   
    # Every day current population 
    # will be three times of the previous day 
    for i in range(2,7): 
        dp[i] = dp[i - 1] * 3; 
   
    # Manually calculated value 
    dp[6] = 726; 
   
    # From 8th day onwards 
    for i in range(8,n+1): 
   
        # Chick population decreases by 2/3 everyday. 
        # For 8th day on [i-6] i.e 2nd day population 
        # was 3 and so 2 new born die on the 6th day 
        # and so on for the upcoming days 
        dp[i] = (dp[i - 1] - (2 * dp[i - 6] // 3)) * 3; 
   
    return dp[n]; 
   
# Driver code 
n = 3; 
   
print(getChicks(n)); 
  
# This code is contributed by Princi Singh 

