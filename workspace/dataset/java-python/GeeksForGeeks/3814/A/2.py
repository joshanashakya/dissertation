

# Python3 program for 
# Smallest sum contiguous subarray | Set 2 
  
# function to find the smallest  
# sum contiguous subarray 
def smallestSumSubarr(arr, n): 
      
    # First invert the sign of the elements 
    for i in range(n): 
        arr[i] = -arr[i] 
  
    # Apply the normal Kadane algorithm but  
    # on the elements of the array having inverted sign 
    sum_here = arr[0] 
    max_sum = arr[0] 
  
    for i in range(1, n): 
  
        sum_here = max(sum_here + arr[i], arr[i]) 
        max_sum = max(max_sum, sum_here) 
  
    # Invert the answer to get minimum val 
    return (-1) * max_sum 
  
# Driver Code 
arr = [3, -4, 2, -3, -1, 7, -5] 
  
n = len(arr) 
  
print("Smallest sum:",  
       smallestSumSubarr(arr, n)) 
  
# This code is contributed by Mohit Kumar 

