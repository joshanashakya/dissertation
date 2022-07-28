

# Python3 program to check if array contains  
# contiguous integers with duplicates allowed  
# in O(1) space 
  
# Function to return true or false 
def check(arr, n): 
  
    k = -10**9
    r = 10**9
  
    # To find the max and min in the array 
    for i in range(n): 
        k = max(k, arr[i]) 
        r = min(r, arr[i]) 
  
    k += 1
  
    # Update the array with the difference  
    # from the max element 
    for i in range(n): 
        arr[i] = k - arr[i] 
  
    for i in range(n): 
  
        # if the element is positive 
        # and less than the size of 
        # array(in range), make it negative 
        if (abs(arr[i]) - 1 < n and 
                arr[abs(arr[i]) - 1] > 0): 
            arr[abs(arr[i]) - 1]= -arr[abs(arr[i]) - 1] 
  
    flag = 0
  
    # Loop from 0 to end of the array 
    for i in range(k - r): 
  
        # Found positive, out of range 
        if (arr[i] > 0): 
            flag = 1
            break
  
    return flag == 0
  
# Driver Code 
  
# Given array 
arr = [5, 2, 3, 6, 4, 4, 6, 6] 
n = len(arr) 
  
# Function Calling 
if (check(arr, n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

