

import sys 
# Python 3 implementation of the approach 
  
# Function that returns the second largest 
# element in the array if exists, else 0 
def getMaxValue(arr,arr_size): 
      
    # There must be at least two elements 
    if (arr_size < 2): 
        return 0
  
    # To store the maximum and the second 
    # maximum element from the array 
    first = -sys.maxsize-1
    second = -sys.maxsize-1
    for i in range(arr_size): 
          
        # If current element is greater than first 
        # then update both first and second 
        if (arr[i] > first): 
            second = first 
            first = arr[i] 
  
        # If arr[i] is in between first and 
        # second then update second 
        elif (arr[i] > second and arr[i] != first): 
            second = arr[i] 
  
    # No second maximum found 
    if (second == -sys.maxsize-1): 
        return 0
    else: 
        return second 
  
# Driver code 
if __name__ == '__main__': 
    arr = [4, 5, 1, 8] 
    n = len(arr) 
    print(getMaxValue(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

