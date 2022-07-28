

# Python implementation of the approach 
  
MAX = 10000
MAX_ELEMENT = 50
  
dp =[[[-1 for i in range(MAX)]  
    for j in range(MAX_ELEMENT)]  
    for k in range(MAX_ELEMENT)] 
  
# Function to return the maximum xor for a 
# subset of size j from the given array 
def Max_Xor(arr, i, j, mask, n): 
    if (i >= n): 
          
        # If the subset is complete then return 
        # the xor value of the selected elements 
        if (j == 0): 
            return mask 
        else: 
            return 0
      
    # Return if already calculated for some 
    # mask and j at the i'th index 
    if (dp[i][j][mask] != -1): 
        return dp[i][j][mask] 
      
    # Initialize answer to 0 
    ans = 0
      
    # If we can still include elements in our subset 
    # include the i'th element 
    if (j > 0): 
        ans = Max_Xor(arr, i + 1, j - 1, mask ^ arr[i], n) 
          
    # Exclude the i'th element 
    # ans store the max of both operations 
    ans = max(ans, Max_Xor(arr, i + 1, j, mask, n)) 
    dp[i][j][mask] = ans 
    return ans 
  
# Driver code 
arr = [2, 5, 4, 1, 3, 7, 6, 8] 
n = len(arr) 
k = 3
  
print(Max_Xor(arr, 0, k, 0, n)) 
  
# This code is contributed by shubhamsingh10 

