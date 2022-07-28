

# Python3 implementation to 
# check whether the array 
# contains a set of 
# contiguous integers 
  
# function to check  
# whether the array 
# contains a set of 
# contiguous integers 
def areElementsContiguous(arr, n): 
      
    # Find maximum and 
    # minimum elements. 
    max1 = max(arr) 
    min1 = min(arr) 
      
    m = max1 - min1 + 1
  
    # There should be at least 
    # m elements in array to 
    # make them contiguous. 
    if (m > n): 
        return False
      
    # Create a visited array 
    # and initialize fals 
  
    visited = [0] * m 
      
    # Mark elements as true. 
    for i in range(0,n) : 
        visited[arr[i] - min1] = True
  
    # If any element is not 
    # marked, all elements 
    # are not contiguous. 
    for i in range(0, m): 
        if (visited[i] == False): 
            return False
  
    return True
  
# Driver program 
arr = [5, 2, 3, 6, 4, 4, 6, 6 ] 
n = len(arr) 
  
if (areElementsContiguous(arr, n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Smitha Dinesh Semwal 

