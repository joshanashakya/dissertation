

# Python3 implementation of the approach 
  
# Function to return the length of  
# the longest sub-array whose product 
# of elements is 0 
def longestSubArray(arr, n) : 
  
    isZeroPresent = False
    for i in range (0 , n) : 
        if (arr[i] == 0) :  
            isZeroPresent = True
            break
          
    if (isZeroPresent) : 
        return n 
  
    return 0
  
# Driver code 
arr = [ 1, 2, 3, 0, 1, 2, 0 ] 
n = len(arr) 
print(longestSubArray(arr, n)) 
  
# This code is contributed by ihritik 

