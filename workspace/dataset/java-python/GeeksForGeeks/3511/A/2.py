

# Python implementation of the approach 
  
# Function to return the maximum possible 
# sum after performing the given operation 
def max_sum(a, n): 
    # Dp vector to store the answer 
    dp = [[0 for i in range(2)] for j in range(n+1)] 
                          
    # Base value 
    dp[0][0] = 0; dp[0][1] = -999999; 
  
    for i in range(0, n):  
        dp[i + 1][0] = max(dp[i][0] + a[i], 
                                dp[i][1] - a[i]); 
        dp[i + 1][1] = max(dp[i][0] - a[i], 
                                dp[i][1] + a[i]); 
  
    # Return the maximum sum 
    return dp[n][0]; 
  
# Driver code 
if __name__ == '__main__': 
    a = [-10, 5, -4 ]; 
    n = len(a); 
  
    print(max_sum(a, n)); 
      
# This code is contributed by 29AjayKumar 

