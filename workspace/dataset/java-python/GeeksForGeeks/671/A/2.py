

# Python3 implementation of the approach 
  
# Function that returns true if the array 
# contains an element which is equal to 
# the XOR of the remaining elements 
def containsElement(arr, n): 
  
    # To store the XOR of all 
    # the array elements 
    xorArr = 0
    for i in range(n): 
        xorArr ^= arr[i] 
  
    # For every element of the array 
    for i in range(n): 
  
        # Take the XOR after excluding 
        # the current element 
        x = xorArr ^ arr[i] 
  
        # If the XOR of the remaining elements 
        # is equal to the current element 
        if (arr[i] == x): 
            return True
  
    # If no such element is found 
    return False
  
# Driver Code 
arr = [8, 2, 4, 15, 1] 
n = len(arr) 
  
if (containsElement(arr, n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

