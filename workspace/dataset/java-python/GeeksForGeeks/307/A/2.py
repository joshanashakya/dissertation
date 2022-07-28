

# Python3 implementation to find the length  
# of the longest subarray having maximum sum 
  
# function to find the maximum sum that 
# exists in a subarray 
def maxSubArraySum(arr, size): 
  
    max_so_far = arr[0] 
    curr_max = arr[0] 
  
    for i in range(1,size): 
        curr_max = max(arr[i], curr_max + arr[i]) 
        max_so_far = max(max_so_far, curr_max) 
    return max_so_far 
  
# function to find the length of longest 
# subarray having sum k 
def lenOfLongSubarrWithGivenSum(arr, n, k): 
  
    # unordered_map 'um' implemented 
    # as hash table 
    um = dict() 
    Sum, maxLen = 0, 0
  
    # traverse the given array 
    for i in range(n): 
  
        # accumulate Sum 
        Sum += arr[i] 
  
        # when subarray starts from index '0' 
        if (Sum == k): 
            maxLen = i + 1
  
        # make an entry for 'Sum' if it is 
        # not present in 'um' 
        if (Sum not in um.keys()): 
            um[Sum] = i 
  
        # check if 'Sum-k' is present in 'um' 
        # or not 
        if (Sum in um.keys()): 
  
            # update maxLength 
            if ((Sum - k) in um.keys() and 
                 maxLen < (i - um[Sum - k])): 
                maxLen = i - um[Sum - k] 
  
    # required maximum length 
    return maxLen 
  
# function to find the length of the longest 
# subarray having maximum Sum 
def lenLongSubarrWithMaxSum(arr, n): 
  
    maxSum = maxSubArraySum(arr, n) 
    return lenOfLongSubarrWithGivenSum(arr, n, maxSum) 
  
# Driver Code 
arr = [5, -2, -1, 3, -4] 
n = len(arr) 
print("Length of longest subarray having maximum sum = ",  
                         lenLongSubarrWithMaxSum(arr, n)) 
   
# This code is contributed by mohit kumar 

