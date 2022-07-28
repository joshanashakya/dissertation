

# Python program to find 
# length of the longest 
# subarray with 
# non-negative numbers. 
  
# Function that returns 
# the longest subarray 
# of non-negative integers  
def longestSubarry(arr,n): 
  
    # Initialize result 
    res = 0 
  
    # Traverse array 
    for i in range(n): 
      
        # Count of current  
        # non-negative integers 
        curr_count = 0
        while (i < n and arr[i] >= 0): 
      
            curr_count+=1
            i+=1
      
        # Update result if required. 
        res = max(res, curr_count) 
      
    return res 
  
  
# Driver code 
  
arr= [1, 0, 4, 0, 1, -1, -1, 0, 0, 1, 0] 
n = len(arr) 
print(longestSubarry(arr, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

