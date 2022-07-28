

# Python implementation of the approach 
  
# Function to return the maximum 
# product of sum for any partition 
def maxProdSum(arr, n): 
      
    prefixArraySum = [0] * n 
    maxProduct = 0
      
    # Initialise prefixArraySum[0] 
    # with arr[0] element 
    prefixArraySum[0] = arr[0] 
      
    # Traverse array elements 
    # to compute prefix array sum 
    for i in range(1, n): 
        prefixArraySum[i] = prefixArraySum[i - 1] + arr[i] 
      
    for i in range(n - 1): 
          
        # Compute left and right array sum 
        leftArraySum = prefixArraySum[i] 
        rightArraySum = prefixArraySum[n - 1] - \ 
                        prefixArraySum[i] 
          
        # Multiplying left and right subarray sum 
        k = leftArraySum * rightArraySum 
          
        # Checking for maximum product of 
        # the sum of left and right subarray 
        if (k > maxProduct): 
            maxProduct = k 
      
    # Printing the maximum value 
    return maxProduct 
  
# Driver code 
arr = [4, 10, 1, 7, 2, 9] 
n = len(arr) 
print(maxProdSum(arr, n)) 
  
# This code is contributed by SHUBHAMSINGH10 

