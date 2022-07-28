

# Python3 implementation of the approach 
  
# Function to return the number of ways to 
# form an array of size n such that sum of 
# all elements is divisible by 2 
def countWays(n, l, r): 
  
    tL, tR = l, r 
  
    # Represents first and last numbers 
    # of each type (modulo 0 and 1) 
    L = [0 for i in range(2)] 
    R = [0 for i in range(2)] 
  
    L[l % 2] = l 
    R[r % 2] = r 
  
    l += 1
    r -= 1
  
    if (l <= tR and r >= tL): 
        L[l % 2], R[r % 2] = l, r 
  
    # Count of numbers of each type  
    # between range 
    cnt0, cnt1 = 0, 0
    if (R[0] and L[0]): 
        cnt0 = (R[0] - L[0]) // 2 + 1
    if (R[1] and L[1]): 
        cnt1 = (R[1] - L[1]) // 2 + 1
  
    dp = [[0 for i in range(2)]  
             for i in range(n + 1)] 
  
    # Base Cases 
    dp[1][0] = cnt0 
    dp[1][1] = cnt1 
    for i in range(2, n + 1): 
  
        # Ways to form array whose sum  
        # upto i numbers modulo 2 is 0 
        dp[i][0] = (cnt0 * dp[i - 1][0] + 
                    cnt1 * dp[i - 1][1]) 
  
        # Ways to form array whose sum upto 
        # i numbers modulo 2 is 1 
        dp[i][1] = (cnt0 * dp[i - 1][1] + 
                    cnt1 * dp[i - 1][0]) 
      
    # Return the required count of ways 
    return dp[n][0] 
  
# Driver Code 
n, l, r = 2, 1, 3
print(countWays(n, l, r)) 
  
# This code is contributed  
# by Mohit Kumar 

