

# Python3 implementation of above approach 
  
# Function to find a subarray 
# whose sum is a multiple of N 
def CheckSubarray(arr, N): 
  
    # Prefix sum array to store cumulative sum 
    presum=[0 for i in range(N + 1)] 
  
    # Single state dynamic programming 
    # relation for prefix sum array 
    for i in range(1, N+1): 
        presum[i] = presum[i - 1] + arr[i - 1] 
  
    # Generating all sub-arrays 
    for i in range(1, N+1): 
  
        for j in range(i, N+1): 
  
            # If the sum of the sub-array[i:j] 
            # is a multiple of N 
            if ((presum[j] - presum[i - 1]) % N == 0): 
                print(i - 1,j - 1) 
                return
  
  
    # If the function reaches here it means 
    # there are no subarrays with sum 
    # as a multiple of N 
    print("-1") 
  
# Driver code 
  
arr = [ 7, 5, 3, 7] 
  
N = len(arr) 
  
CheckSubarray(arr, N) 
  
# This code is contributed by mohit kumar 29 

