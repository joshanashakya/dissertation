

# Python 3 program to find maximum sum  
# in a circular array such that no  
# elements are adjacent in the sum. 
  
# Function to calculate the sum from 
# 0th position to(n-2)th position 
def maxSum1(arr, n): 
  
    dp = [0] * n 
    maxi = 0
  
    for i in range(n - 1): 
  
        # copy the element of original  
        # array to dp[] 
        dp[i] = arr[i] 
  
        # find the maximum element in the array 
        if (maxi < arr[i]): 
            maxi = arr[i] 
  
    # start from 2nd to n-1th pos 
    for i in range(2, n - 1): 
  
        # traverse for all pairs bottom-up 
        # approach 
        for j in range(i - 1) : 
  
            # dp-condition 
            if (dp[i] < dp[j] + arr[i]): 
                dp[i] = dp[j] + arr[i] 
  
                # find maximum sum 
                if (maxi < dp[i]): 
                    maxi = dp[i] 
  
    # return the maximum 
    return maxi 
  
# Function to find the maximum sum 
# from 1st position to n-1-th position 
def maxSum2(arr, n): 
  
    dp = [0] * n 
    maxi = 0
  
    for i in range(1, n): 
        dp[i] = arr[i] 
  
        if (maxi < arr[i]): 
            maxi = arr[i] 
  
    # Traverse from third to n-th pos 
    for i in range(3, n): 
  
        # bootom-up approach 
        for j in range(1, i - 1) : 
  
            # dp condition 
            if (dp[i] < arr[i] + dp[j]): 
                dp[i] = arr[i] + dp[j] 
  
                # find max sum 
                if (maxi < dp[i]): 
                    maxi = dp[i] 
  
    # return max 
    return maxi 
  
def findMaxSum(arr, n): 
    return max(maxSum1(arr, n), maxSum2(arr, n)) 
  
# Driver Code 
if __name__ == "__main__": 
      
    arr = [ 1, 2, 3, 1 ] 
    n = len(arr) 
    print(findMaxSum(arr, n)) 
  
# This code is contributed by ita_c 

