

# Python3 implementation of the approach 
  
N = 5
  
# Function to return the maximum sum 
def func(idx, cur, a, dp, n, x) : 
   
  
    # Base case 
    if (idx == n) : 
        return 0 
  
    # If already calculated 
    if (dp[idx][cur] != -1): 
        return dp[idx][cur]  
  
    ans = 0 
  
    # If no elements have been chosen 
    if (cur == 0) : 
  
        # Do not choose any element and use 
        # Kadane's algorithm by taking max 
        ans = max(ans, a[idx] + func(idx + 1, 0, a, dp, n, x))  
  
        # Choose the sub-array and multiply x 
        ans = max(ans, x * a[idx] + func(idx + 1, 1, a, dp, n, x))  
       
    elif (cur == 1) : 
  
        # Choose the sub-array and multiply x 
        ans = max(ans, x * a[idx] + func(idx + 1, 1, a, dp, n, x))  
  
        # End the sub-array multiplication 
        ans = max(ans, a[idx] + func(idx + 1, 2, a, dp, n, x))  
       
    else : 
  
        # No more multiplication 
        ans = max(ans, a[idx] + func(idx + 1, 2, a, dp, n, x))  
  
    # Memoize and return the answer 
    dp[idx][cur] = ans  
      
    return dp[idx][cur] 
   
  
# Function to get the maximum sum 
def getMaximumSum(a, n, x) : 
   
  
    # Initialize dp with -1 
    dp = [[-1 for i in range(3)] for j in range(n)] 
      
  
    # Iterate from every position and find the 
    # maximum sum which is possible 
    maxi = 0 
    for i in range (0, n) : 
        maxi = max(maxi, func(i, 0, a, dp, n, x))  
  
    return maxi  
   
  
# Driver code 
  
a =  [ -3, 8, -2, 1, -6 ]    
n = len(a)  
x = -1 
  
print(getMaximumSum(a, n, x))  
  
# This code is contributed by ihritik 

