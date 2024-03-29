

# Python3 program to update every 
# array element with sum of previous 
# and next numbers in array  
def ReplaceElements(arr, n): 
  
    # Nothing to do when array  
    # size is 1  
    if n <= 1: 
        return
  
    # store current value of arr[0] 
    # and update it  
    prev = arr[0] 
    arr[0] = arr[0] ^ arr[1] 
  
    # Update rest of the array elements  
    for i in range(1, n - 1): 
  
        # Store current value of  
        # next interation  
        curr = arr[i] 
          
        # Update current value using  
        # previos value  
        arr[i] = prev ^ arr[i + 1] 
          
        # Update previous value  
        prev = curr 
      
    # Update last array element separately  
    arr[n - 1] = prev ^ arr[n - 1] 
  
# Driver Code 
arr = [2, 3, 4, 5, 6] 
n = len(arr) 
ReplaceElements(arr, n) 
for i in range(n): 
    print(arr[i], end = " ") 
  
# This code is contributed 
# by Shrikant13 

