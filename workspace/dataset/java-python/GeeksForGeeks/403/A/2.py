

# Python program to find maximum  
# subarray size, such that all  
# subarrays of that size have 
# sum less than K. 
  
# Search for the maximum length of  
# required subarray. 
def bsearch(prefixsum, n, k): 
  
    # Initialize result 
    # Do Binary Search for largest 
    # subarray size 
    ans, left, right = -1, 1, n 
  
    while (left <= right): 
  
        # Check for all subarrays after mid 
        mid = (left + right)//2
  
        for i in range(mid, n + 1): 
  
            # Checking if all the subarray of  
            # a size is less than k. 
            if (prefixsum[i] - prefixsum[i - mid] > k): 
                i = i - 1
                break
        i = i + 1
        if (i == n + 1): 
            left = mid + 1
            ans = mid 
        # We found a subrray of size mid with sum 
        # greater than k 
        else: 
            right = mid - 1
  
    return ans; 
  
# Return the maximum subarray size, such  
# that all subarray of that size have  
# sum less than K. 
def maxSize(arr, n, k): 
    prefixsum = [0 for x in range(n + 1)] 
      
    # Finding prefix sum of the array. 
    for i in range(n): 
        prefixsum[i + 1] = prefixsum[i] + arr[i] 
  
    return bsearch(prefixsum, n, k); 
  
# Driver Code 
arr = [ 1, 2, 10, 4 ] 
n = len(arr) 
k = 14
print (maxSize(arr, n, k)) 
  
# This code is contributed by Afzal 

