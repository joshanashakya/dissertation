

# Python3 implementation of the approach 
import sys 
  
# Function to print largest element in 
# first half and second half of an array 
def findMax(arr, n) : 
  
    # To store the maximum element 
    # in the first half 
    maxFirst = -sys.maxsize - 1
  
    # Middle index of the array 
    mid = n // 2; 
  
    # Calculate the maximum element 
    # in the first half 
    for i in range(0, mid): 
        maxFirst = max(maxFirst, arr[i]) 
  
    # If the size of array is odd then 
    # the middle element will be included 
    # in both the halves 
    if (n % 2 == 1): 
        maxFirst = max(maxFirst, arr[mid]) 
  
    # To store the maximum element 
    # in the second half 
    maxSecond = -sys.maxsize - 1
  
    # Calculate the maximum element 
    # int the second half 
    for i in range(mid, n): 
        maxSecond = max(maxSecond, arr[i]) 
  
    # Print the found maximums 
    print(maxFirst, ",", maxSecond) 
  
# Driver code 
arr = [1, 12, 14, 5 ] 
n = len(arr) 
  
findMax(arr, n) 
  
# This code is contributed by ihritik 

