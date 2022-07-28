

# Python3 implementation of the approach 
  
# Function to return the maximized XOR 
# after removing an element from the array 
def maxXOR(arr, n): 
      
    # Find XOR of the complete array 
    xorArr = 0
    for i in range(n): 
        xorArr ^= arr[i] 
  
    # To store the final answer 
    ans = 0
  
    # Iterating through the array to find 
    # the final answer 
    for i in range(n): 
        ans = max(ans, (xorArr ^ arr[i])) 
  
    # Return the final answer 
    return ans 
  
# Driver code 
arr = [1, 1, 3] 
n = len(arr) 
  
print(maxXOR(arr, n)) 
  
# This code is contributed by Mohit Kumar 

