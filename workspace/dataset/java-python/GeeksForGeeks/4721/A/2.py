

# Python3 implementation of the approach 
  
# Function that returns true if the array 
# can be reduced to 0s with the given 
# operation performed given number of times 
def check(arr, N, K): 
      
    # Set to store unique elements 
    unique = dict() 
  
    # Add every element of the array 
    # to the set 
    for i in range(N): 
        unique[arr[i]] = 1
  
    # Count of all the unique elements 
    # in the array 
    if len(unique) == K: 
        return True
    return False
  
# Driver code 
arr = [1, 1, 2, 3] 
N = len(arr) 
K = 3
if (check(arr, N, K) == True): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by mohit kumar 

